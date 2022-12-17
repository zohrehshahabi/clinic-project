package ir.mapsa.clinic.service.impl;


import ir.mapsa.clinic.entity.ClinicUser;
import ir.mapsa.clinic.entity.RoleEntity;
import ir.mapsa.clinic.entity.enums.ERole;
import ir.mapsa.clinic.repository.RoleRepository;
import ir.mapsa.clinic.repository.UsersRepository;
import ir.mapsa.clinic.service.AppointmentService;
//import ir.mapsa.clinic.service.AuthService;
import ir.mapsa.clinic.service.AuthService;
import ir.mapsa.clinic.service.LoginTokens;
import ir.mapsa.clinic.service.Token;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.HashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

@Service
@Transactional
@RequiredArgsConstructor

public class AuthServiceImpl implements AuthService {


    @Value("${access.secret.key}")
    private String accessSecretKey;

    @Value("${refresh.secret.key}")
    private String refreshSecretKey;

    @Value("${access.secret.key.validityInMinutes}")
    private  Long accessSecretKeyValidityInMinutes ;

    @Value("${refresh.secret.key.validityInMinutes}")
    private  Long refreshSecretKeyValidityInMinutes ;

    @Value("${server.servlet.context-path}")
    private  String contextPath ;

    private final UsersRepository usersRepository;

    private final PasswordEncoder passwordEncoder;

    private final RoleRepository roleRepository;


    public ClinicUser register(String firstName, String lastName, String email, String password, String passwordConfirm) {
        if (!Objects.equals(password , passwordConfirm)){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST , "password and repeat not matched");
        }

        Set<RoleEntity> roles = new HashSet<>();
        roles.add(roleRepository.findByRole(ERole.USER).orElse(null));
        ClinicUser clinicUser = ClinicUser.builder().firstName(firstName)
                .lastName(lastName).email(email)
                .password(passwordEncoder.encode(password))
                .roles(roles).build();

        return usersRepository.save(clinicUser) ;
    }

    @Override
    public ClinicUser saveOrUpdate(ClinicUser clinicUser) {
        return usersRepository.save(clinicUser);
    }

    @Override
    public LoginTokens login(String email, String password, HttpServletResponse response) {


        ClinicUser user= usersRepository.findByEmail(email).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.BAD_REQUEST, "username or password is wrong"));

        if (! passwordEncoder.matches(password,user.getPassword())){
            throw new  ResponseStatusException(HttpStatus.BAD_REQUEST, "username or password is wrong");
        }


        LoginTokens loginTokens = LoginTokens.of(email,accessSecretKey, accessSecretKeyValidityInMinutes, refreshSecretKey, refreshSecretKeyValidityInMinutes);

        Cookie cookie = new Cookie("refresh_token", loginTokens.getRefreshToken().getToken()) ;
        cookie.setMaxAge(3600);
        cookie.setHttpOnly(true);
        cookie.setPath(contextPath);

        response.addCookie(cookie);

        return loginTokens ;

    }

}

package ir.mapsa.clinic.resources;

<<<<<<< HEAD
import ir.mapsa.clinic.entity.ClinicUser;
import ir.mapsa.clinic.entity.EmployeeEntity;
import ir.mapsa.clinic.entity.Role;
import ir.mapsa.clinic.entity.enums.ERole;
import ir.mapsa.clinic.exceptions.BaseException;
import ir.mapsa.clinic.payload.request.LoginRequest;
import ir.mapsa.clinic.payload.request.SignupRequest;
import ir.mapsa.clinic.payload.response.JwtResponse;
import ir.mapsa.clinic.payload.response.MessageResponse;
import ir.mapsa.clinic.repository.RoleRepository;
import ir.mapsa.clinic.security.jwt.JwtUtils;
import ir.mapsa.clinic.security.services.UserDetailsImpl;
import ir.mapsa.clinic.service.ClinicUserService;
import ir.mapsa.clinic.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthenticationManager authenticationManager;

    private final ClinicUserService userService;
=======

import com.fasterxml.jackson.annotation.JsonProperty;
import ir.mapsa.clinic.entity.ClinicUser;
import ir.mapsa.clinic.entity.EmployeeEntity;
import ir.mapsa.clinic.entity.RoleEntity;
import ir.mapsa.clinic.entity.enums.ERole;
import ir.mapsa.clinic.exceptions.BaseException;
import ir.mapsa.clinic.repository.RoleRepository;
import ir.mapsa.clinic.service.AuthService;
import ir.mapsa.clinic.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

//import java.util.Objects;
import javax.servlet.http.HttpServletResponse;
import java.lang.*;
import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping(value="/api")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;
>>>>>>> 7bbbaa179b3e50a52e534767a57f1f5f7f1b9453

    private final EmployeeService employeeService;

    private final RoleRepository roleRepository;

<<<<<<< HEAD
    private final PasswordEncoder encoder;

    private final JwtUtils jwtUtils;

    @PostMapping("/signin")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {

        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginRequest.getEmail(), loginRequest.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtUtils.generateJwtToken(authentication);

        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
        List<String> roles = userDetails.getAuthorities().stream()
                .map(item -> item.getAuthority())
                .collect(Collectors.toList());

        return ResponseEntity.ok(new JwtResponse(jwt,
                userDetails.getId(),
                userDetails.getUsername(),
                roles));
    }

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signUpRequest) throws BaseException {
        if (userService.existsByEmail(signUpRequest.getEmail())) {
            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse("Error: email is already taken!"));
        }
        Set<Role> roles = new HashSet<>();
        roles.add(roleRepository.findByRole(ERole.ROLE_USER).orElse(null));

//        // Creating a new user account
//        ClinicUser user = new ClinicUser(
//                signUpRequest.getFirstName(),
//                signUpRequest.getLastName(),
//                signUpRequest.getEmail(),
//                encoder.encode(signUpRequest.getPassword())
//        );
        ClinicUser user = ClinicUser.builder().firstName(signUpRequest.getFirstName())
                .lastName(signUpRequest.getLastName())
                .email(signUpRequest.getEmail())
                .password(encoder.encode(signUpRequest.getPassword()))
                .roles(roles).build();
        ClinicUser savedUser = userService.save(user);

        EmployeeEntity employee = EmployeeEntity.builder().firstName(signUpRequest.getFirstName())
                .lastName(signUpRequest.getLastName())
                .email(signUpRequest.getEmail()).build();
        EmployeeEntity savedEmployee = employeeService.saveOrUpdate(employee);

        savedUser.setEmployee(savedEmployee);
        userService.save(savedUser);

        savedEmployee.setClinicUser(savedUser);
        employeeService.saveOrUpdate(savedEmployee);

        return ResponseEntity.ok(new MessageResponse("User registered successfully!"));
    }
}
=======
    record RegisterRequest(@JsonProperty("first_name") String firstName,
                           @JsonProperty("last_name") String lastName ,
                           String email,
                           String password,
                           @JsonProperty("password_confirm") String passwordConfirm){}

    record RegisterResponse(@JsonProperty("first_name") String firstName,
                            @JsonProperty("last_name") String lastName ,
                            String email){}

    @PostMapping("/register")
    public RegisterResponse register(@RequestBody RegisterRequest registerRequest) throws BaseException {
        Set<RoleEntity> roles=new HashSet<>();
        roles.add(roleRepository.findByRole(ERole.USER).orElse(null));
        ClinicUser user =  authService.register(registerRequest.firstName , registerRequest.lastName, registerRequest.email,registerRequest.password,registerRequest.passwordConfirm) ;
        EmployeeEntity employee = EmployeeEntity.builder().firstName(registerRequest.firstName).
                lastName(registerRequest.lastName).
                email(registerRequest.email).
                clinicUser(user).build();
        employeeService.saveOrUpdate(employee);
        user.setEmployee(employee);
        authService.saveOrUpdate(user);

        return new RegisterResponse(user.getFirstName(),  user.getLastName(),user.getEmail());
    }

    record LoginRequest(
            String email,
            String password
    ){}

    record LoginResponse(String token){}

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest loginRequest, HttpServletResponse response){
        var loginTokens =  authService.login(loginRequest.email,loginRequest.password,response) ;
        return new LoginResponse(loginTokens.getAccessToken().getToken());
    }

//    @GetMapping("/user")
//    public UserResponse findUserFromToken(HttpServletResponse )

}

>>>>>>> 7bbbaa179b3e50a52e534767a57f1f5f7f1b9453

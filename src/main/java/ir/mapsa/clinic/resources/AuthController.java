package ir.mapsa.clinic.resources;


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

    private final EmployeeService employeeService;

    private final RoleRepository roleRepository;

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


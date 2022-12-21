package ir.mapsa.clinic.dto;

<<<<<<< HEAD
import ir.mapsa.clinic.base.BaseDto;
import ir.mapsa.clinic.entity.EmployeeEntity;
import ir.mapsa.clinic.entity.Role;
import lombok.*;

=======
import ir.mapsa.clinic.entity.EmployeeEntity;
import ir.mapsa.clinic.entity.RoleEntity;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
>>>>>>> 7bbbaa179b3e50a52e534767a57f1f5f7f1b9453
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
<<<<<<< HEAD
public class ClinicUserDto extends BaseDto {
=======
public class ClinicUserDto {
>>>>>>> 7bbbaa179b3e50a52e534767a57f1f5f7f1b9453

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
<<<<<<< HEAD
    private Set<Role> roles;
    private EmployeeDto employee;
=======
    private Set<RoleEntity> roles;
    private EmployeeEntity employee;
>>>>>>> 7bbbaa179b3e50a52e534767a57f1f5f7f1b9453
}

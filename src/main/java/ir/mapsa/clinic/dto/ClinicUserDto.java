package ir.mapsa.clinic.dto;

import ir.mapsa.clinic.entity.EmployeeEntity;
import ir.mapsa.clinic.entity.RoleEntity;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class ClinicUserDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Set<RoleEntity> roles;
    private EmployeeEntity employee;
}

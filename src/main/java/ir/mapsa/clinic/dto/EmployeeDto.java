package ir.mapsa.clinic.dto;

import ir.mapsa.clinic.base.BaseDto;
import ir.mapsa.clinic.entity.DepartmentEntity;
import ir.mapsa.clinic.entity.ScheduleEntity;
import ir.mapsa.clinic.entity.enums.Gender;
import ir.mapsa.clinic.dto.RoleDto;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class EmployeeDto extends BaseDto {

    protected Long id;
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    @NotBlank
    private String phoneNumber;
    @NotBlank
    private String email;
    @NotNull
    private Gender gender;

    public DepartmentEntity department;

    private Set<RoleDto> roles;


}

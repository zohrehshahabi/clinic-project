package ir.mapsa.clinic.dto;

import ir.mapsa.clinic.base.BaseDto;
import ir.mapsa.clinic.entity.enums.Gender;
import lombok.*;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class EmployeeIdDto extends BaseDto {
    protected Long id;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private String email;

    private Gender gender;

    private Long departmentId;

    private Long roleId;


}

package ir.mapsa.clinic.dto;

import ir.mapsa.clinic.base.BaseDto;
import ir.mapsa.clinic.entity.enums.Gender;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class PatientDto extends BaseDto {
    private Long id;
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    @NotBlank
    private String phoneNumber;
    @NotBlank
    private String email;
    @NotNull
//    @Enumerated(EnumType.STRING)
    private Gender gender;
    //
//    @Column(name="user_name")
//    protected String userName;
//
//    protected String password;
    @NotNull
    private Boolean isActive;
}

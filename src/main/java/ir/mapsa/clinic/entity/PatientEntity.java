package ir.mapsa.clinic.entity;

import ir.mapsa.clinic.base.BaseEntity;
import ir.mapsa.clinic.entity.enums.Gender;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "patients")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PatientEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @Enumerated(EnumType.STRING)
    private Gender gender;

    //    @Column(name="user_name")
//    private String userName;
//
//    private String password;
    @NotNull
    @Column(name = "is_active")
    private Boolean isActive;

}

package ir.mapsa.clinic.entity;

import ir.mapsa.clinic.base.BaseEntity;
import ir.mapsa.clinic.entity.enums.Gender;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Table(name = "employees")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    protected Long id;
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;

    private String phoneNumber;
    @NotBlank
    private String email;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @ManyToOne
    @JoinColumn(name = "emp_dep_id")
    private DepartmentEntity department;

    @OneToOne(targetEntity = ClinicUser.class)
    private ClinicUser clinicUser;


}

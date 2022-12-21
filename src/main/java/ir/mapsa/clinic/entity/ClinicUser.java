package ir.mapsa.clinic.entity;


import ir.mapsa.clinic.base.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Builder
public class ClinicUser extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String email;
    private String password;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
<<<<<<< HEAD
    private Set<Role> roles = new HashSet<>();

    @OneToOne(cascade = CascadeType.ALL)
    private EmployeeEntity employee;

    public ClinicUser(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

=======
    private Set<RoleEntity> roles = new HashSet<>();

    @OneToOne(targetEntity = EmployeeEntity.class)
    private EmployeeEntity employee;

>>>>>>> 7bbbaa179b3e50a52e534767a57f1f5f7f1b9453
}

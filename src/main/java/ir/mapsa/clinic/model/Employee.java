package ir.mapsa.clinic.model;

import ir.mapsa.clinic.model.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "T_employee")

public class Employee extends Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    protected Long id;

    @ManyToOne
    @JoinColumn(name = "emp_dep_id")
    public Department department;

    @ManyToOne
    @JoinColumn(name = "emp_role_id")
    private Role role;

    @OneToOne
    @JoinColumn(name = "emp_sch_id")
    private Schedule schedule;

    public Employee() {

    }

    public Employee(String firstName, String lastName, String phoneNumber, String email, Gender gender, String userName, String password, boolean isActive, Role role,Department department) {
        super(firstName, lastName, phoneNumber, email, gender, userName, password, isActive);
        this.role = role;
        this.department=department;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}

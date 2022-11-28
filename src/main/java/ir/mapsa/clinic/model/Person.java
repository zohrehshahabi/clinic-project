package ir.mapsa.clinic.model;

import ir.mapsa.clinic.model.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@MappedSuperclass

public abstract class Person {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "per_id")
    protected Long id;

    protected String firstName;

    protected String lastName;

    protected String phoneNumber;

    protected String email;

    @Enumerated(EnumType.STRING)
    protected Gender gender;

    @Column(name="user_name")
    protected String userName;

    protected String password;

    @Column(name="is_active")
    protected boolean isActive;

    public Person() {
    }

    public Person(String firstName, String lastName, String phoneNumber, String email, Gender gender, String userName, String password, boolean isActive) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.gender = gender;
        this.userName = userName;
        this.password = password;
        this.isActive = isActive;
    }
}

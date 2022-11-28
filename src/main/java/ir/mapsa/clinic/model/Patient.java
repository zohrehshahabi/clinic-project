package ir.mapsa.clinic.model;

import ir.mapsa.clinic.model.enums.Gender;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "T_patient")
@Getter
@Setter


public class Patient extends Person {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "patient_id")
    private Long id;

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            mappedBy="patient"

    )
    private List<Appointment> appointments=new ArrayList<>();

    public Patient(){

    }
    public Patient(String firstName, String lastName, String phoneNumber, String email, Gender gender, String userName, String password, boolean isActive) {
        super(firstName, lastName, phoneNumber, email, gender, userName, password, isActive);

    }
}

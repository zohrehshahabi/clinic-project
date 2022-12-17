package ir.mapsa.clinic.entity;

import ir.mapsa.clinic.base.BaseEntity;
import lombok.*;
import javax.persistence.*;

@Table(name="appointments")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AppointmentEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "app_id")
    private Long id;


    @Column(name = "app_status")
    private boolean status;

    @ManyToOne
    @JoinColumn(name = "app_pat_id")
    private PatientEntity patient;

}

package ir.mapsa.clinic.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import ir.mapsa.clinic.base.BaseEntity;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Table(name = "schedules")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ScheduleEntity extends BaseEntity{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "sche_id")
    private Long id;

    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
    private LocalDate date;

    @JsonFormat(pattern="HH:mm:ss")
    private LocalTime startDate;

    @JsonFormat(pattern="HH:mm:ss")
    private LocalTime endDate;

    @ManyToOne
    @JoinColumn(name="sch_pat_id")
    public PatientEntity patient;

    @OneToOne
    @JoinColumn(name="sch_emp_id")
    private EmployeeEntity employee;
}

package ir.mapsa.clinic.dto;

import ir.mapsa.clinic.base.BaseDto;
import ir.mapsa.clinic.entity.EmployeeEntity;
import ir.mapsa.clinic.entity.PatientEntity;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ScheduleDto extends BaseDto{

    private Long id;

    private LocalDate date;

    private LocalTime startDate;

    private LocalTime endDate;

    public PatientEntity patient;

    private EmployeeEntity employee;
}

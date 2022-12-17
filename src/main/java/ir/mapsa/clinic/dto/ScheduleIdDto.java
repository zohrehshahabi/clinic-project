package ir.mapsa.clinic.dto;

import ir.mapsa.clinic.base.BaseDto;
import ir.mapsa.clinic.entity.EmployeeEntity;
import ir.mapsa.clinic.entity.PatientEntity;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ScheduleIdDto extends BaseDto {
    private Long id;

    private LocalDate date;

    private LocalTime startDate;

    private LocalTime endDate;

    public Long patientId;

    private Long employeeId;
}

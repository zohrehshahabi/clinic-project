package ir.mapsa.clinic.dto;

import ir.mapsa.clinic.base.BaseDto;
import ir.mapsa.clinic.entity.PatientEntity;
import lombok.*;

import javax.persistence.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AppointmentDto extends BaseDto {

    private Long id;

    private boolean status;

    private PatientEntity patient;
}

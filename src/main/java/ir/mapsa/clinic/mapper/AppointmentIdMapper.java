package ir.mapsa.clinic.mapper;

import ir.mapsa.clinic.base.BaseMapper;
import ir.mapsa.clinic.dto.AppointmentDto;
import ir.mapsa.clinic.dto.AppointmentIdDto;
import ir.mapsa.clinic.entity.AppointmentEntity;
import org.mapstruct.Mapper;

@Mapper
public interface AppointmentIdMapper extends BaseMapper<AppointmentEntity, AppointmentIdDto> {
}

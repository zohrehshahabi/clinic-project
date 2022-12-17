package ir.mapsa.clinic.mapper;

import ir.mapsa.clinic.base.BaseMapper;
import ir.mapsa.clinic.dto.AppointmentDto;
import ir.mapsa.clinic.entity.AppointmentEntity;
import org.mapstruct.Mapper;

@Mapper
public interface AppointmentMapper extends BaseMapper<AppointmentEntity, AppointmentDto> {
}

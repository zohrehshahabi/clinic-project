package ir.mapsa.clinic.mapper;

import ir.mapsa.clinic.base.BaseMapper;
import ir.mapsa.clinic.dto.AppointmentDto;
import ir.mapsa.clinic.dto.ClinicUserDto;
import ir.mapsa.clinic.entity.AppointmentEntity;
import ir.mapsa.clinic.entity.ClinicUser;
import org.mapstruct.Mapper;

@Mapper
public interface ClinicUserMapper extends BaseMapper<ClinicUser, ClinicUserDto> {
}

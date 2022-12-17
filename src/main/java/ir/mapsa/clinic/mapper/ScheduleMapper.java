package ir.mapsa.clinic.mapper;

import ir.mapsa.clinic.base.BaseMapper;
import ir.mapsa.clinic.dto.ScheduleDto;
import ir.mapsa.clinic.entity.ScheduleEntity;
import org.mapstruct.Mapper;

@Mapper
public interface ScheduleMapper extends BaseMapper<ScheduleEntity, ScheduleDto> {
}

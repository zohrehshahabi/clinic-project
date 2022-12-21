package ir.mapsa.clinic.mapper;

import ir.mapsa.clinic.base.BaseMapper;
import ir.mapsa.clinic.dto.ScheduleIdDto;
import ir.mapsa.clinic.entity.ScheduleEntity;
import org.mapstruct.Mapper;

@Mapper
public interface ScheduleIdMapper extends BaseMapper<ScheduleEntity, ScheduleIdDto> {
}

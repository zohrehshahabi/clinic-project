package ir.mapsa.clinic.mapper;

import ir.mapsa.clinic.base.BaseMapper;
import ir.mapsa.clinic.dto.EmployeeIdDto;
import ir.mapsa.clinic.entity.EmployeeEntity;
import org.mapstruct.Mapper;

@Mapper
public interface EmployeeIdMapper extends BaseMapper<EmployeeEntity, EmployeeIdDto> {
}

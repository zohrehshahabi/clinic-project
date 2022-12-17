package ir.mapsa.clinic.mapper;

import ir.mapsa.clinic.base.BaseMapper;
import ir.mapsa.clinic.dto.DepartmentDto;
import ir.mapsa.clinic.entity.DepartmentEntity;
import org.mapstruct.Mapper;

@Mapper
public interface DepartmentMapper extends BaseMapper<DepartmentEntity, DepartmentDto> {
}

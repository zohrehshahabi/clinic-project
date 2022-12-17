package ir.mapsa.clinic.mapper;

import ir.mapsa.clinic.base.BaseMapper;
import ir.mapsa.clinic.dto.RoleDto;
import ir.mapsa.clinic.entity.RoleEntity;
import org.mapstruct.Mapper;

@Mapper
public interface RoleMapper extends BaseMapper<RoleEntity, RoleDto> {
}

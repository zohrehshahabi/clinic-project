package ir.mapsa.clinic.mapper;

import ir.mapsa.clinic.base.BaseMapper;
import ir.mapsa.clinic.dto.RoleDto;
import ir.mapsa.clinic.entity.RoleEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface RoleMapper  {

    RoleEntity convertDtoToEntity(RoleDto d);

    RoleDto convertEntityToDto(RoleEntity t);

    List<RoleEntity> convertListDtoToListEntity(List<RoleDto> dList);

    List<RoleDto> convertListEntityToListDto(List<RoleEntity> tList);
}

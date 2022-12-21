package ir.mapsa.clinic.mapper;

import ir.mapsa.clinic.dto.RoleDto;
import ir.mapsa.clinic.entity.Role;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface RoleMapper  {

    Role convertDtoToEntity(RoleDto d);

    RoleDto convertEntityToDto(Role t);

    List<Role> convertListDtoToListEntity(List<RoleDto> dList);

    List<RoleDto> convertListEntityToListDto(List<Role> tList);
}

package ir.mapsa.clinic.mapper;

<<<<<<< HEAD
import ir.mapsa.clinic.dto.RoleDto;
import ir.mapsa.clinic.entity.Role;
=======
import ir.mapsa.clinic.base.BaseMapper;
import ir.mapsa.clinic.dto.RoleDto;
import ir.mapsa.clinic.entity.RoleEntity;
>>>>>>> 7bbbaa179b3e50a52e534767a57f1f5f7f1b9453
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface RoleMapper  {

<<<<<<< HEAD
    Role convertDtoToEntity(RoleDto d);

    RoleDto convertEntityToDto(Role t);

    List<Role> convertListDtoToListEntity(List<RoleDto> dList);

    List<RoleDto> convertListEntityToListDto(List<Role> tList);
=======
    RoleEntity convertDtoToEntity(RoleDto d);

    RoleDto convertEntityToDto(RoleEntity t);

    List<RoleEntity> convertListDtoToListEntity(List<RoleDto> dList);

    List<RoleDto> convertListEntityToListDto(List<RoleEntity> tList);
>>>>>>> 7bbbaa179b3e50a52e534767a57f1f5f7f1b9453
}

package ir.mapsa.clinic.mapper;

import ir.mapsa.clinic.base.BaseMapper;
import ir.mapsa.clinic.dto.PatientDto;
<<<<<<< HEAD
import ir.mapsa.clinic.entity.PatientEntity;
=======
import ir.mapsa.clinic.dto.RoleDto;
import ir.mapsa.clinic.entity.PatientEntity;
import ir.mapsa.clinic.entity.RoleEntity;
>>>>>>> 7bbbaa179b3e50a52e534767a57f1f5f7f1b9453
import org.mapstruct.Mapper;

@Mapper
public interface PatientMapper extends BaseMapper<PatientEntity, PatientDto> {


}

package ir.mapsa.clinic.resources;

import ir.mapsa.clinic.base.*;
import ir.mapsa.clinic.dto.PatientDto;
import ir.mapsa.clinic.entity.PatientEntity;
<<<<<<< HEAD
import ir.mapsa.clinic.mapper.PatientMapper;
import ir.mapsa.clinic.service.PatientService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

=======
import ir.mapsa.clinic.entity.RoleEntity;
import ir.mapsa.clinic.mapper.PatientMapper;
import ir.mapsa.clinic.mapper.RoleMapper;
import ir.mapsa.clinic.service.PatientService;
import ir.mapsa.clinic.service.RoleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
>>>>>>> 7bbbaa179b3e50a52e534767a57f1f5f7f1b9453
@RestController
@RequestMapping("/patients")
public class PatientRestController extends BaseRestController<
        PatientDto, PatientEntity, PatientMapper, PatientService, Long> {
    public PatientRestController(PatientService service, PatientMapper mapper) {
        super(service, mapper);
    }
}

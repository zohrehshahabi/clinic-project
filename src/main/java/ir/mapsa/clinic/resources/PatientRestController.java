package ir.mapsa.clinic.resources;

import ir.mapsa.clinic.base.*;
import ir.mapsa.clinic.dto.PatientDto;
import ir.mapsa.clinic.entity.PatientEntity;
import ir.mapsa.clinic.mapper.PatientMapper;
import ir.mapsa.clinic.service.PatientService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patients")
public class PatientRestController extends BaseRestController<
        PatientDto, PatientEntity, PatientMapper, PatientService, Long> {
    public PatientRestController(PatientService service, PatientMapper mapper) {
        super(service, mapper);
    }
}

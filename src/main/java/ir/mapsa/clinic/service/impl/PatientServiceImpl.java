package ir.mapsa.clinic.service.impl;

import ir.mapsa.clinic.base.BaseServiceImpl;
import ir.mapsa.clinic.entity.PatientEntity;
import ir.mapsa.clinic.repository.PatientRepository;
import ir.mapsa.clinic.service.PatientService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PatientServiceImpl extends BaseServiceImpl<PatientEntity,
        Long, PatientRepository> implements PatientService {
    public PatientServiceImpl(PatientRepository repository) {

        super(repository);
    }

}

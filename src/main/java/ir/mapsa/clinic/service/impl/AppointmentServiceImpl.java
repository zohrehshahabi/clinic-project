package ir.mapsa.clinic.service.impl;

import ir.mapsa.clinic.base.BaseServiceImpl;
import ir.mapsa.clinic.entity.AppointmentEntity;
import ir.mapsa.clinic.repository.AppointmentRepository;
import ir.mapsa.clinic.service.AppointmentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AppointmentServiceImpl extends BaseServiceImpl<AppointmentEntity,
        Long, AppointmentRepository> implements AppointmentService {
    public AppointmentServiceImpl(AppointmentRepository repository) {
        super(repository);
    }
}

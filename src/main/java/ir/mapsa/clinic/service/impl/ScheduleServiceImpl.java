package ir.mapsa.clinic.service.impl;

import ir.mapsa.clinic.base.BaseServiceImpl;
import ir.mapsa.clinic.entity.ScheduleEntity;
import ir.mapsa.clinic.repository.ScheduleRepository;
import ir.mapsa.clinic.service.ScheduleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ScheduleServiceImpl extends BaseServiceImpl<ScheduleEntity,Long, ScheduleRepository> implements ScheduleService {
    public ScheduleServiceImpl(ScheduleRepository repository) {
        super(repository);
    }
}

package ir.mapsa.clinic.service.impl;

import ir.mapsa.clinic.base.BaseServiceImpl;
import ir.mapsa.clinic.entity.DepartmentEntity;
import ir.mapsa.clinic.repository.DepartmentRepository;
import ir.mapsa.clinic.service.DepartmentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DepartmentServiceImpl extends BaseServiceImpl<DepartmentEntity,
        Long, DepartmentRepository>implements DepartmentService {
    public DepartmentServiceImpl(DepartmentRepository repository) {
        super(repository);
    }
}

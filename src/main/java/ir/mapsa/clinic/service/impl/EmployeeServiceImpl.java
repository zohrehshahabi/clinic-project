package ir.mapsa.clinic.service.impl;

import ir.mapsa.clinic.base.BaseServiceImpl;
import ir.mapsa.clinic.entity.EmployeeEntity;
<<<<<<< HEAD
import ir.mapsa.clinic.repository.EmployeeRepository;
import ir.mapsa.clinic.service.EmployeeService;
=======
import ir.mapsa.clinic.entity.RoleEntity;
import ir.mapsa.clinic.repository.EmployeeRepository;
import ir.mapsa.clinic.repository.RoleRepository;
import ir.mapsa.clinic.service.EmployeeService;
import ir.mapsa.clinic.service.RoleService;
>>>>>>> 7bbbaa179b3e50a52e534767a57f1f5f7f1b9453
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmployeeServiceImpl extends BaseServiceImpl <EmployeeEntity,
        Long, EmployeeRepository> implements EmployeeService {
    public EmployeeServiceImpl(EmployeeRepository repository) {
        super(repository);
    }

}

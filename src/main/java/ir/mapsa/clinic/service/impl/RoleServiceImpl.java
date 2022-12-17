package ir.mapsa.clinic.service.impl;

import ir.mapsa.clinic.base.BaseServiceImpl;
import ir.mapsa.clinic.entity.RoleEntity;
import ir.mapsa.clinic.exceptions.NotFoundExceptions;
import ir.mapsa.clinic.repository.RoleRepository;
import ir.mapsa.clinic.service.RoleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class RoleServiceImpl extends BaseServiceImpl<RoleEntity,
        Long, RoleRepository> implements RoleService {
    public RoleServiceImpl(RoleRepository repository) {
        super(repository);
    }


}

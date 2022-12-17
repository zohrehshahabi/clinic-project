package ir.mapsa.clinic.service.impl;

import ir.mapsa.clinic.base.BaseServiceImpl;
import ir.mapsa.clinic.entity.RoleEntity;
import ir.mapsa.clinic.entity.enums.ERole;
import ir.mapsa.clinic.exceptions.NotFoundExceptions;
import ir.mapsa.clinic.repository.RoleRepository;
import ir.mapsa.clinic.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@Service
@Transactional
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    @Override
    public RoleEntity findById(Long id) {
        return roleRepository.findById(id).get();
    }

    @Override
    public RoleEntity findByRole(ERole name) {
        return roleRepository.findByRole(name).get();
    }
}

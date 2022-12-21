package ir.mapsa.clinic.service.impl;

import ir.mapsa.clinic.entity.Role;
import ir.mapsa.clinic.entity.enums.ERole;
import ir.mapsa.clinic.repository.RoleRepository;
import ir.mapsa.clinic.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    @Override
    public Role findById(Long id) {
        return roleRepository.findById(id).get();
    }

    @Override
    public Role findByRole(ERole name) {
        return roleRepository.findByRole(name).get();
    }
}

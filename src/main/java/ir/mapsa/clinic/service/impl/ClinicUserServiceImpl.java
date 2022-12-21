package ir.mapsa.clinic.service.impl;

import ir.mapsa.clinic.entity.ClinicUser;
import ir.mapsa.clinic.repository.ClinicUserRepository;
import ir.mapsa.clinic.repository.RoleRepository;
import ir.mapsa.clinic.service.ClinicUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class ClinicUserServiceImpl implements ClinicUserService {

    private final ClinicUserRepository clinicUserRepository;


    @Override
    public ClinicUser findById(Long id) {
        return clinicUserRepository.findById(id).get();
    }

    @Override
    public ClinicUser save(ClinicUser clinicUser) {
        return clinicUserRepository.save(clinicUser);
    }

    @Override
    public ClinicUser findByEmail(String email) {
        return clinicUserRepository.findByEmail(email);
    }

    @Override
    public Boolean existsByEmail(String username) {
        return clinicUserRepository.existsByEmail(username);
    }
}

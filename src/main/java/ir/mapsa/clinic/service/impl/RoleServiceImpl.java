package ir.mapsa.clinic.service.impl;

<<<<<<< HEAD
import ir.mapsa.clinic.entity.Role;
import ir.mapsa.clinic.entity.enums.ERole;
=======
import ir.mapsa.clinic.base.BaseServiceImpl;
import ir.mapsa.clinic.entity.RoleEntity;
import ir.mapsa.clinic.entity.enums.ERole;
import ir.mapsa.clinic.exceptions.NotFoundExceptions;
>>>>>>> 7bbbaa179b3e50a52e534767a57f1f5f7f1b9453
import ir.mapsa.clinic.repository.RoleRepository;
import ir.mapsa.clinic.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

<<<<<<< HEAD
=======
import java.util.Optional;

>>>>>>> 7bbbaa179b3e50a52e534767a57f1f5f7f1b9453

@Service
@Transactional
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    @Override
<<<<<<< HEAD
    public Role findById(Long id) {
=======
    public RoleEntity findById(Long id) {
>>>>>>> 7bbbaa179b3e50a52e534767a57f1f5f7f1b9453
        return roleRepository.findById(id).get();
    }

    @Override
<<<<<<< HEAD
    public Role findByRole(ERole name) {
=======
    public RoleEntity findByRole(ERole name) {
>>>>>>> 7bbbaa179b3e50a52e534767a57f1f5f7f1b9453
        return roleRepository.findByRole(name).get();
    }
}

package ir.mapsa.clinic.repository;

<<<<<<< HEAD
import ir.mapsa.clinic.entity.Role;
=======
import ir.mapsa.clinic.dto.RoleDto;
import ir.mapsa.clinic.entity.PatientEntity;
import ir.mapsa.clinic.entity.RoleEntity;
>>>>>>> 7bbbaa179b3e50a52e534767a57f1f5f7f1b9453
import ir.mapsa.clinic.entity.enums.ERole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
<<<<<<< HEAD
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findById (Long id);
    Optional<Role> findByRole(ERole name);
=======
public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
    Optional<RoleEntity> findById (Long id);
    Optional<RoleEntity> findByRole(ERole name);
>>>>>>> 7bbbaa179b3e50a52e534767a57f1f5f7f1b9453
}

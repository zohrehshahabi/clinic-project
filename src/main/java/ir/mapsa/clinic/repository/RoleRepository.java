package ir.mapsa.clinic.repository;

import ir.mapsa.clinic.dto.RoleDto;
import ir.mapsa.clinic.entity.PatientEntity;
import ir.mapsa.clinic.entity.RoleEntity;
import ir.mapsa.clinic.entity.enums.ERole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
    Optional<RoleEntity> findById (Long id);
    Optional<RoleEntity> findByRole(ERole name);
}

package ir.mapsa.clinic.repository;

import ir.mapsa.clinic.entity.Role;
import ir.mapsa.clinic.entity.enums.ERole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findById (Long id);
    Optional<Role> findByRole(ERole name);
}

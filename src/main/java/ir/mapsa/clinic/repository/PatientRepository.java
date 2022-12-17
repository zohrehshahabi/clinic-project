package ir.mapsa.clinic.repository;

import ir.mapsa.clinic.entity.EmployeeEntity;
import ir.mapsa.clinic.entity.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface PatientRepository extends JpaRepository<PatientEntity,Long> {
    Optional<PatientEntity> findById (Long id);
}

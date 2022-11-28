package ir.mapsa.clinic.repository;

import ir.mapsa.clinic.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
}

package ir.mapsa.clinic.repository;

import ir.mapsa.clinic.entity.PatientEntity;
import ir.mapsa.clinic.entity.ScheduleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ScheduleRepository extends JpaRepository<ScheduleEntity,Long> {
    Optional<ScheduleEntity> findById (Long id);
}

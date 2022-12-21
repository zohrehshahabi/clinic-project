package ir.mapsa.clinic.repository;

import ir.mapsa.clinic.entity.AppointmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<AppointmentEntity,Long> {
}

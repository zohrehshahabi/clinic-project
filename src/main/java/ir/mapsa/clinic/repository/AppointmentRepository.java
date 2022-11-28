package ir.mapsa.clinic.repository;

import ir.mapsa.clinic.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment,Long> {
}

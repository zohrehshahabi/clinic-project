package ir.mapsa.clinic.repository;

import ir.mapsa.clinic.model.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Schedule,Long> {

}

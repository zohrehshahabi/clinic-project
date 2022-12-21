package ir.mapsa.clinic.repository;

import ir.mapsa.clinic.entity.DepartmentEntity;
<<<<<<< HEAD
=======
import ir.mapsa.clinic.entity.EmployeeEntity;
import ir.mapsa.clinic.entity.RoleEntity;
import ir.mapsa.clinic.entity.ScheduleEntity;
>>>>>>> 7bbbaa179b3e50a52e534767a57f1f5f7f1b9453
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentEntity,Long> {
    Optional<DepartmentEntity> findById (Long id);
}

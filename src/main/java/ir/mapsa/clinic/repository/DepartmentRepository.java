package ir.mapsa.clinic.repository;

import ir.mapsa.clinic.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
}

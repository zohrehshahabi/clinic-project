package ir.mapsa.clinic.repository;

import ir.mapsa.clinic.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}

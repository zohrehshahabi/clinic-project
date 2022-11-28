package ir.mapsa.clinic;

import ir.mapsa.clinic.model.*;
import ir.mapsa.clinic.model.enums.Gender;
import ir.mapsa.clinic.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

import java.util.List;

@SpringBootApplication
public class ClinicApplication implements CommandLineRunner {

    @Autowired
    AppointmentRepository appointmentRepository;
    @Autowired
    DepartmentRepository departmentRepository;
	@Autowired
	EmployeeRepository employeeRepository;
    @Autowired
    PatientRepository patientRepository;
    @Autowired
    RoleRepository roleRepository;
	@Autowired
	ScheduleRepository scheduleRepository;

    public static void main(String[] args) {
        SpringApplication.run(ClinicApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        //create patients
        Patient patient1 = new Patient("fatemeh", "allahdadi", "09371149889", "fatemehallahdadi4@gmail.com", Gender.FEMALE, "root", "fa1376", true);
        Patient patient2 = new Patient("saeed","akbari","09121165137","saeed@gmail.com",Gender.MALE,"sa1234","123498",false);
        List<Patient> patients=new ArrayList<>();
        patients.add(patient1);
        patients.add(patient2);
        patientRepository.saveAll(patients);

        //create Roles
        Role role1 = new Role("doctor");
        Role role2 = new Role("nurse");
        Role role3 = new Role("receptionist");
        List<Role> roles=new ArrayList<>();
        roles.add(role1);
        roles.add(role2);
        roles.add(role3);
        roleRepository.saveAll(roles);

        //create department
        Department department1=new Department("pathology","pa");
        Department department2=new Department("psychiatry","ps");
        Department department3=new Department("neurology","ne");
        List<Department> departments=new ArrayList<>();
        departments.add(department1);
        departments.add(department2);
        departments.add(department3);
        departmentRepository.saveAll(departments);

        //create employee
        Employee employee1 = new Employee("sara", "fatahi", "09372519596", "fatemehallahdadi4@gmail.com", Gender.FEMALE, "fa1376", "123456", true, role1,department1);
        Employee employee2 = new Employee("ahmad", "rad", "09123399478", "ahmadrad@gmail.com", Gender.MALE, "ah1376", "1234536", true, role1,department2);
        List<Employee> employees=new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employeeRepository.saveAll(employees);

        //create schedule
        Schedule schedule1 = new Schedule();
        //schedule1.setDate(LocalDateTime.now().getDay);
        schedule1.setEmployee(employee1);
        Schedule schedule2 = new Schedule();
        schedule2.setEmployee(employee2);
        List<Schedule> schedules=new ArrayList<>();
        schedules.add(schedule1);
        schedules.add(schedule2);
        scheduleRepository.saveAll(schedules);

        //create appointment
        Appointment appointment1 = new Appointment();
        appointment1.setPatient(patient1);
        appointment1.setStatus(true);
        appointmentRepository.save(appointment1);




    }
}

package ir.mapsa.clinic.resources;

<<<<<<< HEAD
import ir.mapsa.clinic.dto.EmployeeDto;
import ir.mapsa.clinic.dto.EmployeeIdDto;
import ir.mapsa.clinic.entity.EmployeeEntity;
=======
import ir.mapsa.clinic.base.BaseRestController;
import ir.mapsa.clinic.dto.EmployeeDto;
import ir.mapsa.clinic.dto.EmployeeIdDto;
import ir.mapsa.clinic.entity.EmployeeEntity;
import ir.mapsa.clinic.entity.RoleEntity;
import ir.mapsa.clinic.entity.enums.ERole;
>>>>>>> 7bbbaa179b3e50a52e534767a57f1f5f7f1b9453
import ir.mapsa.clinic.exceptions.BaseException;
import ir.mapsa.clinic.mapper.EmployeeIdMapper;
import ir.mapsa.clinic.mapper.EmployeeMapper;
import ir.mapsa.clinic.repository.RoleRepository;
import ir.mapsa.clinic.service.DepartmentService;
import ir.mapsa.clinic.service.EmployeeService;
import ir.mapsa.clinic.service.RoleService;
import ir.mapsa.clinic.service.ScheduleService;
import lombok.RequiredArgsConstructor;
<<<<<<< HEAD
import org.springframework.context.annotation.Scope;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@PreAuthorize("hasRole('DOCTOR')")
=======
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.Principal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

>>>>>>> 7bbbaa179b3e50a52e534767a57f1f5f7f1b9453
@RestController
@RequestMapping("/employees")
@RequiredArgsConstructor
public class EmployeeRestController {
    private final EmployeeService employeeService;
    private final EmployeeMapper employeeMapper;
    private final EmployeeIdMapper employeeIdMapper;
    private final RoleRepository roleRepository;
    private final RoleService roleService;
    private final ScheduleService scheduleService;
    private final DepartmentService departmentService;




    @PostMapping
    public EmployeeDto createEmployee(@Valid @RequestBody EmployeeIdDto employeeIdDto) throws BaseException {
        EmployeeEntity employeeEntity = employeeIdMapper.convertDtoToEntity(employeeIdDto);
//        Set<RoleEntity> roles = new HashSet<>();
//        roles.add(roleService.findById(employeeIdDto.getRoleId()));
//        employeeEntity.setRoles(roles);
        employeeEntity.setDepartment(departmentService.findById(employeeIdDto.getDepartmentId()));
        return employeeMapper.convertEntityToDto(employeeService.saveOrUpdate(employeeEntity));
    }

    @GetMapping("/{id}")
    public EmployeeDto findEmployeeById(@PathVariable Long id) throws BaseException {
        EmployeeEntity employeeEntity = employeeService.findById(id);
        return employeeMapper.convertEntityToDto(employeeEntity);
    }

    @GetMapping
    public List<EmployeeDto> findEmployees() throws BaseException {
        List<EmployeeEntity> employeeEntityList = employeeService.findAll();
        return employeeMapper.convertListEntityToListDto(employeeEntityList);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployeeById(@PathVariable Long id) throws BaseException {
        employeeService.findById(id);
        employeeService.deleteById(id);
    }

    @PutMapping
    public EmployeeDto update(@Valid @RequestBody EmployeeIdDto employeeIdDto) throws BaseException {
        EmployeeEntity employeeEntity = employeeIdMapper.convertDtoToEntity(employeeIdDto);
//        Set<RoleEntity> roles = new HashSet<>();
//        roles.add(roleService.findById(employeeIdDto.getRoleId()));
//        employeeEntity.setRoles(roles);
        return employeeMapper.convertEntityToDto(employeeService.saveOrUpdate(employeeEntity));
    }

}

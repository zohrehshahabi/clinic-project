package ir.mapsa.clinic.resources;

import ir.mapsa.clinic.base.BaseRestController;
import ir.mapsa.clinic.dto.DepartmentDto;
import ir.mapsa.clinic.dto.EmployeeDto;
import ir.mapsa.clinic.entity.DepartmentEntity;
import ir.mapsa.clinic.entity.EmployeeEntity;
import ir.mapsa.clinic.mapper.DepartmentMapper;
import ir.mapsa.clinic.mapper.EmployeeMapper;
import ir.mapsa.clinic.service.DepartmentService;
import ir.mapsa.clinic.service.EmployeeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/departments")
public class DepartmentRestController extends BaseRestController<
        DepartmentDto, DepartmentEntity, DepartmentMapper, DepartmentService,Long> {

    public DepartmentRestController(DepartmentService service, DepartmentMapper mapper) {
        super(service, mapper);
    }
}

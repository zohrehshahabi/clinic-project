package ir.mapsa.clinic.resources;

import ir.mapsa.clinic.dto.ScheduleDto;
import ir.mapsa.clinic.dto.ScheduleIdDto;
<<<<<<< HEAD
=======
import ir.mapsa.clinic.entity.EmployeeEntity;
import ir.mapsa.clinic.entity.RoleEntity;
>>>>>>> 7bbbaa179b3e50a52e534767a57f1f5f7f1b9453
import ir.mapsa.clinic.entity.ScheduleEntity;
import ir.mapsa.clinic.exceptions.BaseException;
import ir.mapsa.clinic.mapper.ScheduleIdMapper;
import ir.mapsa.clinic.mapper.ScheduleMapper;
import ir.mapsa.clinic.service.EmployeeService;
import ir.mapsa.clinic.service.PatientService;
import ir.mapsa.clinic.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
<<<<<<< HEAD
import java.util.List;
=======
import java.util.HashSet;
import java.util.List;
import java.util.Set;
>>>>>>> 7bbbaa179b3e50a52e534767a57f1f5f7f1b9453

@RestController
@RequestMapping("/schedules")
@RequiredArgsConstructor
public class ScheduleRestController {
    private final ScheduleIdMapper scheduleIdMapper;
    private final EmployeeService employeeService;
    private final PatientService patientService;
    private final ScheduleMapper scheduleMapper;
    private final ScheduleService scheduleService;

    @PostMapping
    public ScheduleDto createSchedule(@Valid @RequestBody ScheduleIdDto scheduleIdDto) throws BaseException {
        ScheduleEntity scheduleEntity = scheduleIdMapper.convertDtoToEntity(scheduleIdDto);
        scheduleEntity.setEmployee(employeeService.findById(scheduleIdDto.getEmployeeId()));
        scheduleEntity.setPatient(patientService.findById(scheduleIdDto.getPatientId()));
        return scheduleMapper.convertEntityToDto(scheduleService.saveOrUpdate(scheduleEntity));
    }

    @GetMapping("/{id}")
    public ScheduleDto findScheduleById(@PathVariable Long id) throws BaseException {
        ScheduleEntity scheduleEntity = scheduleService.findById(id);
        return scheduleMapper.convertEntityToDto(scheduleEntity);
    }

    @GetMapping
    public List<ScheduleDto> findSchedules() throws BaseException {
        List<ScheduleEntity> schedules = scheduleService.findAll();
        return scheduleMapper.convertListEntityToListDto(schedules);
    }

    @DeleteMapping("/{id}")
    public void deleteScheduleById(@PathVariable Long id) throws BaseException {
        scheduleService.findById(id);
        scheduleService.deleteById(id);
    }
    @PutMapping
    public ScheduleDto updateSchedule(@RequestBody ScheduleIdDto scheduleIdDto) throws BaseException{
        ScheduleEntity scheduleEntity = scheduleIdMapper.convertDtoToEntity(scheduleIdDto);
        scheduleEntity.setPatient(patientService.findById(scheduleIdDto.getPatientId()));
        scheduleEntity.setEmployee(employeeService.findById(scheduleIdDto.getEmployeeId()));
        return scheduleMapper.convertEntityToDto(scheduleService.saveOrUpdate(scheduleEntity));
    }
}

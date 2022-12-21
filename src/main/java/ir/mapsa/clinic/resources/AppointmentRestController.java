package ir.mapsa.clinic.resources;

import ir.mapsa.clinic.dto.AppointmentDto;
import ir.mapsa.clinic.dto.AppointmentIdDto;
import ir.mapsa.clinic.entity.AppointmentEntity;
import ir.mapsa.clinic.exceptions.BaseException;
import ir.mapsa.clinic.mapper.AppointmentIdMapper;
import ir.mapsa.clinic.mapper.AppointmentMapper;
import ir.mapsa.clinic.service.AppointmentService;
import ir.mapsa.clinic.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointments")
@RequiredArgsConstructor
public class AppointmentRestController {
    private final AppointmentIdMapper appointmentIdMapper;
    private final PatientService patientService;
    private final AppointmentMapper appointmentMapper;
    private final AppointmentService appointmentService;

    @PostMapping
    public AppointmentDto createAppointment(@RequestBody AppointmentIdDto appointmentIdDto) throws BaseException {
        AppointmentEntity appointmentEntity = appointmentIdMapper.convertDtoToEntity(appointmentIdDto);
        appointmentEntity.setPatient(patientService.findById(appointmentIdDto.getPatientId()));
       return appointmentMapper.convertEntityToDto(appointmentService.saveOrUpdate(appointmentEntity));
    }
    @GetMapping
    public List<AppointmentDto> findAppointments() throws BaseException{
        List<AppointmentEntity> appointmentEntityList= appointmentService.findAll();
       return appointmentMapper.convertListEntityToListDto(appointmentEntityList);
    }
    @GetMapping("/{id}")
    public AppointmentDto findAppointmentById(@PathVariable Long id) throws BaseException{
        AppointmentEntity appointmentEntity = appointmentService.findById(id);
        return appointmentMapper.convertEntityToDto(appointmentEntity);
    }
    @PutMapping
    public AppointmentDto updateAppointment(@RequestBody AppointmentIdDto appointmentIdDto) throws BaseException {
        AppointmentEntity appointmentEntity = appointmentIdMapper.convertDtoToEntity(appointmentIdDto);
        appointmentEntity.setPatient(patientService.findById(appointmentIdDto.getPatientId()));
        return appointmentMapper.convertEntityToDto(appointmentService.saveOrUpdate(appointmentEntity));
    }
    @DeleteMapping("/{id}")
    public void deleteAppointmentById(@PathVariable Long id)throws BaseException{
        appointmentService.findById(id);
        appointmentService.deleteById(id);
    }

}

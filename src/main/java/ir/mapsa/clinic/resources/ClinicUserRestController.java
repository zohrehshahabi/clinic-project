package ir.mapsa.clinic.resources;

import ir.mapsa.clinic.dto.ClinicUserDto;
import ir.mapsa.clinic.dto.EditRoleDto;
import ir.mapsa.clinic.entity.ClinicUser;
import ir.mapsa.clinic.entity.Role;
import ir.mapsa.clinic.mapper.ClinicUserMapper;
import ir.mapsa.clinic.mapper.RoleMapper;
import ir.mapsa.clinic.payload.response.MessageResponse;
import ir.mapsa.clinic.service.ClinicUserService;
import ir.mapsa.clinic.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Set;

@RestController
@RequestMapping("/clinicUser")
@RequiredArgsConstructor
public class ClinicUserRestController {
    private final ClinicUserService clinicUserService;
    private final RoleService roleService;
    private final ClinicUserMapper clinicUserMapper;

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/add")
    public ResponseEntity<?> setRole(@Valid @RequestBody EditRoleDto editRoleDto){
        ClinicUser clinicUser = clinicUserService.findById(editRoleDto.getId());
        Set<Role> roles = clinicUser.getRoles();
        roles.add(roleService.findById(editRoleDto.getRoleId()));
        ClinicUser save = clinicUserService.save(clinicUser);
        return ResponseEntity.ok(new MessageResponse("add role successfully!"));
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/delete")
    public ResponseEntity<?> deleteRole(@Valid @RequestBody EditRoleDto editRoleDto){
        ClinicUser clinicUser = clinicUserService.findById(editRoleDto.getId());
        Set<Role> roles = clinicUser.getRoles();
        roles.remove(roleService.findById(editRoleDto.getRoleId()));
        clinicUserService.save(clinicUser);
        return ResponseEntity.ok(new MessageResponse("remove role successfully!"));
    }
}

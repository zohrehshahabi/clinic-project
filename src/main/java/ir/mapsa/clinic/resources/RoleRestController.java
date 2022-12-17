package ir.mapsa.clinic.resources;


import ir.mapsa.clinic.base.BaseRestController;
import ir.mapsa.clinic.dto.RoleDto;
import ir.mapsa.clinic.entity.RoleEntity;
import ir.mapsa.clinic.mapper.RoleMapper;
import ir.mapsa.clinic.service.RoleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/roles")

public class RoleRestController extends BaseRestController<
        RoleDto, RoleEntity, RoleMapper, RoleService, Long> {

    public RoleRestController(RoleService service, RoleMapper mapper) {
        super(service, mapper);
    }
}

package ir.mapsa.clinic.service;

import ir.mapsa.clinic.entity.Role;
import ir.mapsa.clinic.entity.enums.ERole;

public interface RoleService  {
    Role findById (Long id);
    Role findByRole(ERole name);
}

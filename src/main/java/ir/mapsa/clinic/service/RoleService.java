package ir.mapsa.clinic.service;

import ir.mapsa.clinic.base.BaseService;
import ir.mapsa.clinic.entity.RoleEntity;
import ir.mapsa.clinic.entity.enums.ERole;

import java.util.Optional;

public interface RoleService  {
    RoleEntity findById (Long id);
    RoleEntity findByRole(ERole name);
}

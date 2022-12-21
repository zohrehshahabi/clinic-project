package ir.mapsa.clinic.service;

<<<<<<< HEAD
import ir.mapsa.clinic.entity.Role;
import ir.mapsa.clinic.entity.enums.ERole;

public interface RoleService  {
    Role findById (Long id);
    Role findByRole(ERole name);
=======
import ir.mapsa.clinic.base.BaseService;
import ir.mapsa.clinic.entity.RoleEntity;
import ir.mapsa.clinic.entity.enums.ERole;

import java.util.Optional;

public interface RoleService  {
    RoleEntity findById (Long id);
    RoleEntity findByRole(ERole name);
>>>>>>> 7bbbaa179b3e50a52e534767a57f1f5f7f1b9453
}

package ir.mapsa.clinic.service;

import ir.mapsa.clinic.entity.ClinicUser;
import ir.mapsa.clinic.exceptions.BaseException;

public interface ClinicUserService {

    ClinicUser findById(Long id);

    ClinicUser save(ClinicUser clinicUser);

    ClinicUser findByEmail(String email) ;

    Boolean existsByEmail(String username);
}

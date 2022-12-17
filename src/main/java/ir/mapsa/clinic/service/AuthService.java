package ir.mapsa.clinic.service;

import ir.mapsa.clinic.base.BaseService;
import ir.mapsa.clinic.entity.ClinicUser;
import ir.mapsa.clinic.exceptions.BaseException;

import javax.servlet.http.HttpServletResponse;

public interface AuthService  {
    ClinicUser register(String firstName, String lastName, String email, String password, String passwordConfirm);

    ClinicUser saveOrUpdate(ClinicUser clinicUser);

    LoginTokens login(String email, String password, HttpServletResponse response);

}

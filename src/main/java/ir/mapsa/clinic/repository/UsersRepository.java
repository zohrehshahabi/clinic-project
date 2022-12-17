package ir.mapsa.clinic.repository;


import ir.mapsa.clinic.entity.ClinicUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<ClinicUser, Long> {

     Optional<ClinicUser> findByEmail(String email) ;
}

package ir.mapsa.clinic.repository;


import ir.mapsa.clinic.entity.ClinicUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClinicUserRepository extends JpaRepository<ClinicUser, Long> {

     ClinicUser findByEmail(String email) ;

     Boolean existsByEmail(String username);
}

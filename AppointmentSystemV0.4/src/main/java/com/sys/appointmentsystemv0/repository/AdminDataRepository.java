//package com.sys.appointment_system.repository;
package com.sys.appointmentsystemv0.repository;


//import com.sys.appointment_system.model.EmployeeData;
import com.sys.appointmentsystemv0.model.AdminData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminDataRepository extends JpaRepository<AdminData,Long>
{

    Optional<AdminData> findById(Long ID);
    Optional<AdminData> findByDateOfBirth(String DOB);
    Optional<AdminData> findByEmail(String email);
    Optional<AdminData> findByFirstName(String FN);
    Optional<AdminData> findByLastName(String LN);
    Optional<AdminData> findByPassword(String pass);
    Optional<AdminData> findByUserName(String UN);
    Optional<AdminData> findByUserRole(String UR);

}

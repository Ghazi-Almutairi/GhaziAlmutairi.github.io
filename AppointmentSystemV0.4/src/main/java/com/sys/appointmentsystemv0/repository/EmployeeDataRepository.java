//package com.sys.appointment_system.repository;
package com.sys.appointmentsystemv0.repository;


//import com.sys.appointment_system.model.EmployeeData;
import com.sys.appointmentsystemv0.model.EmployeeData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeDataRepository extends JpaRepository<EmployeeData,Long>
{


    Optional<EmployeeData> findById(Long ID);
    Optional<EmployeeData> findByDateOfBirth(String DOB);
    Optional<EmployeeData> findByEmail(String email);
    Optional<EmployeeData> findByFirstName(String FN);
    Optional<EmployeeData> findByLastName(String LN);
    Optional<EmployeeData> findByPassword(String pass);
    EmployeeData findByUserName(String UN);
    Optional<EmployeeData> findByUserRole(String UR);


}

//package com.sys.appointment_system.repository;
package com.sys.appointmentsystemv0.repository;


//import com.sys.appointment_system.model.EmployeeData;
import com.sys.appointmentsystemv0.model.AdminData;
import com.sys.appointmentsystemv0.model.AppointmentData;
import com.sys.appointmentsystemv0.model.EmailOfRepresentativesData;
import com.sys.appointmentsystemv0.model.EmployeeData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmailOfRepresentativesDataRepository extends JpaRepository<EmailOfRepresentativesData,Long>
{

    Optional<EmailOfRepresentativesData> findById(Long ID);
    Optional<EmailOfRepresentativesData> findByEmailOfRep(String EOR);
    Optional<EmailOfRepresentativesData> findByNameOfRep(String NOR);
    Optional<EmailOfRepresentativesData> findByAdminApproved(String Approved);
//    Optional<EmailOfRepresentativesData> findByAdminDataAndId(AdminData AD);
//    EmailOfRepresentativesData findByEmployeeDataAndId(EmployeeData empData, Long id);


}

package com.sys.appointmentsystemv0.repository;


import com.sys.appointmentsystemv0.model.AppointmentData;
import com.sys.appointmentsystemv0.model.EmployeeData;
import com.sys.appointmentsystemv0.model.OperatorData;
import com.sys.appointmentsystemv0.model.RepresentativeData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AppointmentDataRepository extends JpaRepository<AppointmentData,Long>
{
    Optional<AppointmentData> findById(Long ID);
Optional<AppointmentData> findByEmployeeDataAndId(EmployeeData empData,Long id);
    AppointmentData findByRepresentativeDataAndId(RepresentativeData repData,Long id);
    AppointmentData findByOperatorDataAndId(OperatorData oprData,Long id);
    Optional<AppointmentData> findBySortedDate(String SD);
    Optional<AppointmentData> findByApprovedWorkFlowAndId(String AP,Long Id);
    Optional<AppointmentData> findByDate(String date);
    Optional<AppointmentData> findByDateStatus(String dateStatus);
    Optional<AppointmentData> findByReason(String reason);
    Optional<AppointmentData> findByNewDateAndId(String newDate,long id);
    List<AppointmentData> findAll();
}

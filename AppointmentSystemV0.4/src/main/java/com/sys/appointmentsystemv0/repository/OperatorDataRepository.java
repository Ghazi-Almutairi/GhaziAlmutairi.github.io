package com.sys.appointmentsystemv0.repository;


import com.sys.appointmentsystemv0.model.OperatorData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OperatorDataRepository extends JpaRepository<OperatorData,Long>
{
    Optional<OperatorData> findById(Long ID);
    Optional<OperatorData> findByDateOfBirth(String DOB);
    Optional<OperatorData> findByEmail(String email);
    Optional<OperatorData> findByFirstName(String FN);
    Optional<OperatorData> findByLastName(String LN);
    Optional<OperatorData> findByPassword(String pass);
    Optional<OperatorData> findByUserName(String UN);
    Optional<OperatorData> findByUserRole(String UR);
}

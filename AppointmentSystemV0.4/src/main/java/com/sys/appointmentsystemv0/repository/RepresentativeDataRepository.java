package com.sys.appointmentsystemv0.repository;

import com.sys.appointmentsystemv0.model.RepresentativeData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RepresentativeDataRepository extends JpaRepository<RepresentativeData,Long>
{
    Optional<RepresentativeData> findById(Long ID);
    Optional<RepresentativeData> findByFirstName(String id);
    Optional<RepresentativeData> findByDateOfBirth(String DOB);
    Optional<RepresentativeData> findByEmail(String email);

    Optional<RepresentativeData> findByLastName(String LN);
    Optional<RepresentativeData> findByPassword(String pass);
    Optional<RepresentativeData> findByUserName(String UN);
    Optional<RepresentativeData> findByUserRole(String UR);
}

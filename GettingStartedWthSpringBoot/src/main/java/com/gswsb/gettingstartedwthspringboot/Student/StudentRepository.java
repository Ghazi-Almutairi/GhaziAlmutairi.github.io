package com.gswsb.gettingstartedwthspringboot.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional

public interface StudentRepository extends JpaRepository<Student, Long>{
    Optional<Student> findByEmail(String email);

    @Modifying
    @Query(value = "UPDATE student SET Name =:studentName, email =:studentEmail WHERE id =:Id",nativeQuery = true)
    void UpdateEmailAndNameById(@Param("studentEmail") String studentEmail, @Param("Id") long studentId,@Param("studentName") String studentName);

}

package com.gswsb.gettingstartedwthspringboot.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
//Service and Component are the same but for readability
public class StudentService {
    Student student;
    private StudentRepository studentRepository;
    @Autowired
    public StudentService(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }
    public List<Student> getStudent(){
        return studentRepository.findAll();
//        return List.of(
//                new Student(1,"Name","name@email",DOB ,2022-DOB.getYear())
//        );
    }
    public void setStudent(Student student){
        Optional<Student> studentEmail = studentRepository.findByEmail(student.getEmail());
        if (studentEmail.isPresent()){
            throw new IllegalStateException("Email taken");
        }
        studentRepository.save(student);
        System.out.println(student);

//        return List.of(
//                new Student(1,"Name","name@email",DOB ,2022-DOB.getYear())
//        );
    }

    public void deleteStudent(long studentId) {
        boolean exist =studentRepository.existsById(studentId);
        if (!exist){
            throw new IllegalStateException("Student "+studentId+" has been deleted");
        }
        studentRepository.deleteById(studentId);
    }
    public void updateStudent(long studentId,String studentName,String studentEmail){
        boolean exist =studentRepository.existsById(studentId);
        if (!exist){
            System.out.println("hey1");
            throw new IllegalStateException("Student "+studentId+" does not exist");
        }
        System.out.println("hey2");
        System.out.println(studentEmail+studentId);
        studentRepository.UpdateEmailAndNameById(studentEmail,studentId,studentEmail);

    }

}

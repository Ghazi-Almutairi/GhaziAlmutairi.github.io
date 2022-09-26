package com.gswsb.gettingstartedwthspringboot.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
@RequestMapping(path = "api/v1/Student")
public class StudentController {
    private final StudentService studentService;
    private final StudentRepository studentRepository;
    @Autowired
    //Inject vs Autowired
    public StudentController(StudentService studentService,StudentRepository studentRepository) {
        this.studentService = studentService;
        this.studentRepository = studentRepository;
    }
    @GetMapping
    public List<Object> getStudent(){
        return List.of(studentService.getStudent(),studentRepository.getReferenceById(102L));
    }
    @PostMapping
    public void setStudent(@RequestBody Student studentInput){
        studentService.setStudent(studentInput);
    }
    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") long id){
        studentService.deleteStudent(id);
    }
    @PutMapping(path = "{studentId}")
    public void updateStudent(@PathVariable long studentId,@RequestBody Student student){
        System.out.println(studentId+student.getName()+student.getEmail());
        String studentName=student.getName();
        String studentEmail=student.getEmail();
        studentService.updateStudent(studentId,studentName,studentEmail);
    }
}
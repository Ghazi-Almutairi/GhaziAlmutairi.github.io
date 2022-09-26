package com.gswsb.gettingstartedwthspringboot.Student;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName= "student_sequence",
            allocationSize = 1,
            initialValue = 101
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
                    generator = "student_sequence"
    )
    private long id;
    private String name;
    private String email;
    private LocalDate DOB;
    @Transient
    private Integer age;

    public Student() {
    }

    public Student(long id, String name, String email, LocalDate DOB) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.DOB = DOB;
    }

    public Student(String name, String email, LocalDate DOB) {
        this.name = name;
        this.email = email;
        this.DOB = DOB;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {this.email = email;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public Integer getAge() {
        Date thisYear=new Date();
        Integer age =(thisYear.getYear()+1900)-this.DOB.getYear();
        return age ;
    }

    public void setAge(Integer age) {this.age=age;}

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", DOB=" + DOB +
                ", age=" + age +
                '}';
    }
}

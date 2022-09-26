package com.gswsb.gettingstartedwthspringboot.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
                Student name=new Student(1,"Name","name@email",LocalDate.of(1999,12,29));
            Student adam=new Student("adam","adam@email",LocalDate.of(1998,11,22));
            studentRepository.saveAll(List.of(name,adam));
        };
    }
}

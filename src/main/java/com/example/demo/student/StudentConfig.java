package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository studentRepository){
        return args -> {
           Student abhilash = new Student(
                   "Abhilash",
                    "abhilashnair538@gmail.com",
                    LocalDate.of(1992, Month.DECEMBER,23)
            );

            Student dhruv = new Student(
                    "Dhruv",
                    "dhruvabhilash@gmail.com",
                    LocalDate.of(1992, Month.JANUARY,4)
            );

            studentRepository.saveAll(
                    List.of(abhilash,dhruv)
            );
        };
    }
}

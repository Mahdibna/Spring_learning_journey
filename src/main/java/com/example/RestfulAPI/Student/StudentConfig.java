package com.example.RestfulAPI.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.DATE;
import static java.util.Calendar.JULY;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mahdi = new Student(
                    "Mahdi",
                    "mahdibna8@gmail.com",
                    LocalDate.of(2000 ,JULY , 14)
            );
            Student alex =  new Student(
                    "Alex",
                    "Alex8@gmail.com",
                    LocalDate.of(2000 , Month.AUGUST, 14)
            );
            Student arwa =  new Student(
                    "arwa",
                    "arwa8@gmail.com",

                    LocalDate.of(2000 , Month.JUNE, 14)
            );
            repository.saveAll(
                    List.of(arwa , mahdi , alex)
            );
        };
    }
}

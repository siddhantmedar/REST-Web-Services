package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.JANUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student siddhant = new Student(
                    "Siddhant",
                    LocalDate.of(1999,1,21),
                    "siddhant.medar@gmail.com"
            );

            Student vicky = new Student(
                    "Vicky",
                    LocalDate.of(2005, 1,21),
                    "vicky@gmail.com"
            );

            repository.saveAll(
                    List.of(siddhant,vicky)
            );
        };
    }
}

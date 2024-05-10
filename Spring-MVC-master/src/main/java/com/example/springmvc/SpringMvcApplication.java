package com.example.springmvc;

import com.example.springmvc.Entities.Patient;
import com.example.springmvc.Repositories.PatientRepositery;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class SpringMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMvcApplication.class, args);
    }

    //@Bean
    CommandLineRunner start(PatientRepositery patientRepositery){
        return  args -> {
        patientRepositery.save(new Patient(null,"khalid",
                new Date(),false,120));
        patientRepositery.save(new Patient(null,"Rami",
                    new Date(),false,122));
        patientRepositery.save(new Patient(null,"salah",
                    new Date(),false,123));
        };
    }

}

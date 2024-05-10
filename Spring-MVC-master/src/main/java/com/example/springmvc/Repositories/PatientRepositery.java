package com.example.springmvc.Repositories;

import com.example.springmvc.Entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepositery extends JpaRepository<Patient,Long> {
    Page<Patient> findByNomContains(String kw, Pageable pageable);
}

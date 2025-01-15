package com.healthcare.patient_service.repository;

import com.healthcare.patient_service.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {}

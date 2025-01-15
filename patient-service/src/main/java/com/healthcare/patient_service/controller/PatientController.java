package com.healthcare.patient_service.controller;

import com.healthcare.patient_service.model.Patient;
import com.healthcare.patient_service.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {
    @Autowired
    private PatientRepository repository;

    @GetMapping
    public List<Patient> getAllPatients() {
        return repository.findAll();
    }

    @PostMapping
    public Patient createPatient(@RequestBody Patient patient) {
        return repository.save(patient);
    }
}

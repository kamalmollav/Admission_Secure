package com.Numetry.Secure.Admission.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import com.Numetry.Secure.Admission.entity.Student;

@RestController
public interface StudentRepository extends JpaRepository<Student, Long>{

}

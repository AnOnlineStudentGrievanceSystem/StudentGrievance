package com.codeverse.grievance_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.codeverse.grievance_system.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Student findByEmail(String email);
}
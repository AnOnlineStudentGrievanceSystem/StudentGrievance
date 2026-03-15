package com.codeverse.grievance_system.service;

import com.codeverse.grievance_system.model.Student;

public interface StudentService {

    Student registerStudent(Student student);

    Student login(String email, String password);
}
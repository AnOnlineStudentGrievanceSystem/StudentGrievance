package com.codeverse.grievance_system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.codeverse.grievance_system.model.Student;
import com.codeverse.grievance_system.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student registerStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student login(String email, String password) {

        Student student = studentRepository.findByEmail(email);

        if(student != null && student.getPassword().equals(password)) {
            return student;
        }

        return null;
    }
}
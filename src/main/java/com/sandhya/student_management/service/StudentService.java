package com.sandhya.student_management.service;

import com.sandhya.student_management.model.Student;
import com.sandhya.student_management.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    /* public Student updateStudent(String id, Student student) {
        student.setId(id);
        return repository.save(student);
    }*/

    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    public List<Student> getAllStudents() {
        return repository.findAll();
    }
}
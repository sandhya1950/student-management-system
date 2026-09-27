package com.sandhya.student_management.controller;

import com.sandhya.student_management.model.Student;
import com.sandhya.student_management.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return service.saveStudent(student);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }
   /* @PutMapping("/{id}")
    public Student updateStudent(@PathVariable String id,
                                 @RequestBody Student student) {
        return service.updateStudent(id, student);
    }

    */
}
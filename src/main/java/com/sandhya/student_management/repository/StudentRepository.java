package com.sandhya.student_management.repository;

import com.sandhya.student_management.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {

}
package com.netcracker.backend.service;

import com.netcracker.backend.entity.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public interface StudentService {
    public Student find(String name);
    public Student findByStudentId(int studentId);
    public ArrayList<Student> findAllStudents();
}

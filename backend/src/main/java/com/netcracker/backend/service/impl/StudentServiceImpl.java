package com.netcracker.backend.service.impl;

import com.netcracker.backend.entity.Student;
import com.netcracker.backend.repository.StudentRepository;
import com.netcracker.backend.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student find(String name) {
        return studentRepository.findByName(name);
    }

    @Override
    public Student findByStudentId(int id) {
        return studentRepository.findByStudId(id);
    }

    @Override
    public ArrayList<Student> findAllStudents() {
        return studentRepository.findAll();
    }


}

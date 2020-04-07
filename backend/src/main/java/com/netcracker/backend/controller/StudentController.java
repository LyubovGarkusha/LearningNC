package com.netcracker.backend.controller;

import com.netcracker.backend.entity.Student;
import com.netcracker.backend.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/{studentName}", method = RequestMethod.GET)
    public Student getStudentByName(@PathVariable(name = "studentName") String studentName){
        return studentService.find(studentName);
    }

    @RequestMapping(value = "/id/{studentId}", method = RequestMethod.GET)
    public Student getStudentById(@PathVariable(name = "studentId") int studentId){
        return studentService.findByStudentId(studentId);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ArrayList<Student> findAll(){
        return studentService.findAllStudents();
    }
}

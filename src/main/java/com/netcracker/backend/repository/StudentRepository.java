package com.netcracker.backend.repository;

import com.netcracker.backend.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
    Student findByName(String name);
    Student findByStudId(int name);
    ArrayList<Student> findAll();

}

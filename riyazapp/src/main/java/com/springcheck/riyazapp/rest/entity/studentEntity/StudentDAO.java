package com.springcheck.riyazapp.rest.entity.studentEntity;

import com.springcheck.riyazapp.rest.entity.studentEntity.Student;

import java.util.List;

public interface StudentDAO {

    List<Student> findAll();

    Student findById(int id);

    Student save(Student student);
    void deleteById(int id);
}

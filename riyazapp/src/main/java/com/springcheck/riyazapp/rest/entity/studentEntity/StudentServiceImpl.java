package com.springcheck.riyazapp.rest.entity.studentEntity;

import com.springcheck.riyazapp.rest.entity.studentEntity.Student;
import com.springcheck.riyazapp.rest.entity.studentEntity.StudentDAO;
import com.springcheck.riyazapp.rest.entity.studentEntity.StudentService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    public StudentDAO studentDAO;

    @Autowired
    public StudentServiceImpl(StudentDAO studentDAO){this.studentDAO= studentDAO;};

    @Override
    public List<Student> findAll() {
        return studentDAO.findAll();
    }

    @Override
    public Student findById(int id) {
        return studentDAO.findById(id);
    }

    @Transactional
    @Override
    public Student save(Student student) {
        return studentDAO.save(student);
    }

    @Transactional
    @Override
    public void deleteById(int id) {
 studentDAO.deleteById(id);
    }

}

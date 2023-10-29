package com.springcheck.riyazapp.rest.entity.studentEntity;

import com.springcheck.riyazapp.rest.entity.studentEntity.Student;
import com.springcheck.riyazapp.rest.entity.studentEntity.StudentDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Repository
public class StudentDAOImpl implements StudentDAO {


    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void insert(Student student) {
        entityManager.merge(student);
    }
    @Override
    public List<Student> findAll() {

     TypedQuery<Student> studentTypedQuery=entityManager.createQuery("from Student",Student.class);
     List<Student>students= studentTypedQuery.getResultList();
        return students;
    }

    @Override
    public Student findById(int id) {
      Student student =entityManager.find(Student.class,id);
        return student;
    }



    @Override
    public Student save(Student student) {
        Student student1 =entityManager.merge(student);
        return student1;
    }

    @Override
    public void deleteById(int id) {
        Student student =entityManager.find(Student.class,id);
   entityManager.remove(student);

    }
}

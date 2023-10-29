package com.springcheck.riyazapp.rest.controllers;

import com.springcheck.riyazapp.rest.entity.studentEntity.Student;
import com.springcheck.riyazapp.rest.entity.studentEntity.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:8580")

public class StudentRestController {


  private StudentService studentService;

  @Autowired
  public StudentRestController(StudentService studentService){this.studentService = studentService;};


  @GetMapping("/students")
    public List<Student> getStudents()
{
return studentService.findAll();
}

    @GetMapping("/students/{studentId}")
    public Student getStudents(@PathVariable int studentId)
    {
        Student student= studentService.findById(studentId);
        if (student==null)
        {
            throw new RuntimeException("No match" + studentId);
        }

        return student;
    }

    @PostMapping("/studentsAdd")
    public Student addStudent(@RequestBody Student student)
    {
        System.out.println("invoked");
      //  student.setId(0);
        Student dbStudent= studentService.save(student);
        return dbStudent;

    }


}


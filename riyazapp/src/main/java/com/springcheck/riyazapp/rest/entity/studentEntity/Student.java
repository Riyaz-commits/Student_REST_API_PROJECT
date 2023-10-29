package com.springcheck.riyazapp.rest.entity.studentEntity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "student")
@Data
public class Student {


    @Column(name = "name", nullable = true)
    private String name;

    @Id
    //  @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = true)
    private Integer id;

    @Column(name = "grade", nullable = true)
    private String grade;

    @Column(name = "rollno", nullable = true)
    private Integer rollNo;
    public Student() {
    }

}

package com.springcheck.riyazapp.rest.entity.studentEntity;

import jakarta.persistence.*;

@Entity
@Table(name="student")
public class Student {

    public Integer getRollNo() {
        return rollNo;
    }


    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Column(name="rollno",nullable=true)
    private Integer rollNo;

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +'\'' +
        "id=" + id +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }

    @Column(name="name",nullable=true)
    private String name;

    @Id
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",nullable=true)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name="grade",nullable=true)
    private String grade;
    public Student(Integer rollNo, Integer id, String name, String grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public Student(){}

}

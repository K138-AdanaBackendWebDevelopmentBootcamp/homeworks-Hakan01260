package com.proje.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;

    private String name;

    private LocalDate birtOfDate;

    private String address;

    private String gender;

    @ManyToMany(mappedBy = "studentList", fetch = FetchType.LAZY)
    private List<Course> courseList = new ArrayList<>();

    public Student() {

    }

    public Student(String name, LocalDate birtOfDate, String address, String gender) {
        this.name = name;
        this.birtOfDate = birtOfDate;
        this.address = address;
        this.gender = gender;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirtOfDate() {
        return birtOfDate;
    }

    public void setBirtOfDate(LocalDate birtOfDate) {
        this.birtOfDate = birtOfDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", birtOfDate=" + birtOfDate +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}

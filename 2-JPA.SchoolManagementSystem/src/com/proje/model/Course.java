package com.proje.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseCode;

    private String courseName;

    private int creditScore;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(joinColumns = @JoinColumn(name = "courseCode"), inverseJoinColumns = @JoinColumn(name = "studentId"))
    private List<Student> studentList = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "instructorId")
    private Instructor instructor;

    public Course() {

    }

    public Course(String courseName, int creditScore) {
        this.courseName = courseName;
        this.creditScore = creditScore;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return courseCode == course.courseCode && creditScore == course.creditScore && Objects.equals(courseName, course.courseName) && Objects.equals(studentList, course.studentList) && Objects.equals(instructor, course.instructor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseName, courseCode, creditScore, studentList, instructor);
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseCode=" + courseCode +
                ", courseName='" + courseName + '\'' +
                ", creditScore=" + creditScore +
                '}';
    }
}

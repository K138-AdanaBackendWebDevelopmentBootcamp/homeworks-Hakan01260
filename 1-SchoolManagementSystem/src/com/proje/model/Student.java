package com.proje.model;

import java.util.Date;
import java.util.List;

public class Student {

    private String name;

    private Date birtOfDate;

    private String address;

    private String gender;

    private List<Course> courseList;

    public Student() {

    }

    public Student(String name, Date birtOfDate, String address, String gender) {
        this.name = name;
        this.birtOfDate = birtOfDate;
        this.address = address;
        this.gender = gender;
    }

    public Student(String name, Date birtOfDate, String address, String gender, List<Course> coursesList) {
        this.name = name;
        this.birtOfDate = birtOfDate;
        this.address = address;
        this.gender = gender;
        this.courseList = coursesList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirtOfDate() {
        return birtOfDate;
    }

    public void setBirtOfDate(Date birtOfDate) {
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

    public List<Course> getCoursesList() {
        return courseList;
    }

    public void setCoursesList(List<Course> coursesList) {
        this.courseList = coursesList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", birtOfDate=" + birtOfDate +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", coursesList=" + courseList +
                '}';
    }
}

package com.proje.model;

import java.util.List;

public class PermanentInstructor extends Instructor {

    private double fixedSalary;

    public PermanentInstructor() {
    }

    public PermanentInstructor(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public PermanentInstructor(String name, String address, long phoneNumber, double fixedSalary) {
        super(name, address, phoneNumber);
        this.fixedSalary = fixedSalary;
    }

    public PermanentInstructor(String name, String address, long phoneNumber, List<Course> courseList, double fixedSalary) {
        super(name, address, phoneNumber, courseList);
        this.fixedSalary = fixedSalary;
    }

    public double getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    @Override
    public String toString() {
        return "PermanentInstructor{" +
                "fixedSalary=" + fixedSalary +
                "} " + super.toString();
    }
}

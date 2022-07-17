package com.proje.model;

import javax.persistence.Entity;

@Entity
public class PermanentInstructor extends Instructor {

    private double fixedSalary;

    public PermanentInstructor() {
    }

    public PermanentInstructor(String name, String address, long phoneNumber, double fixedSalary) {
        super(name, address, phoneNumber);
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

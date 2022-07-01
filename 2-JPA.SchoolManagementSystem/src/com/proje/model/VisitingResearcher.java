package com.proje.model;

import javax.persistence.Entity;

@Entity
public class VisitingResearcher extends Instructor{

    private double hourlySalary;

    public VisitingResearcher() {}

    public VisitingResearcher(String name, String address, long phoneNumber, double hourlySalary) {
        super(name, address, phoneNumber);
        this.hourlySalary = hourlySalary;
    }

    public double getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    @Override
    public String toString() {
        return "VisitingResearcher{" +
                "hourlySalary=" + hourlySalary +
                "} " + super.toString();
    }
}

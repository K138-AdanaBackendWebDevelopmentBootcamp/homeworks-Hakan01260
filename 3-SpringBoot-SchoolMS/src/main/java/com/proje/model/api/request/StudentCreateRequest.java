package com.proje.model.api.request;

import java.time.LocalDate;

public class StudentCreateRequest {

    private String name;

    private LocalDate birtOfDate;

    private String address;

    private String gender;

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
}

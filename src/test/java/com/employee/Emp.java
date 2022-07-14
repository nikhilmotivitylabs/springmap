package com.employee;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
    private String name;
    private List<String> phone;
    private Set<String> adress;
    private Map<String,String> courses;

    public Emp(String name, List<String> phone, Set<String> adress, Map<String, String> courses) {
        this.name = name;
        this.phone = phone;
        this.adress = adress;
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                ", adress=" + adress +
                ", courses=" + courses +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhone() {
        return phone;
    }

    public void setPhone(List<String> phone) {
        this.phone = phone;
    }

    public Set<String> getAdress() {
        return adress;
    }

    public void setAdress(Set<String> adress) {
        this.adress = adress;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }
}

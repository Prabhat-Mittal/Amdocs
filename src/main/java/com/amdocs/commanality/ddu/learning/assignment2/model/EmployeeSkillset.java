package com.amdocs.commanality.ddu.learning.assignment2.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeSkillset {

    private String empId;
    private List<String> requiredSkills = new ArrayList<>();
    private List<String> actualSkills = new ArrayList<>();

    public String getEmpId() {
        return empId;
    }
    public List<String> getRequiredSkills() {
        return requiredSkills;
    }
    public List<String> getActualSkills() {
        return actualSkills;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }
    public void setRequiredSkills(List<String> requiredSkills) {
        this.requiredSkills = requiredSkills;
    }
    public void setActualSkills(List<String> actualSkills) {
        this.actualSkills = actualSkills;
    }
}

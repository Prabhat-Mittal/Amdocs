package com.amdocs.commanality.ddu.learning.assignment2.service;

import com.amdocs.commanality.ddu.learning.assignment2.model.EmployeeMissingSkillset;
import com.amdocs.commanality.ddu.learning.assignment2.model.EmployeeSkillset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ValidateSkillsApplicationService {

    @Autowired
    EmployeeMissingSkillset employeeMissingSkillset;

    public EmployeeMissingSkillset validateSkills(EmployeeSkillset employeeSkillset){
        employeeMissingSkillset.setEmpId(employeeSkillset.getEmpId());
        employeeSkillset.getRequiredSkills().removeIf(skills -> employeeSkillset.getActualSkills().stream().anyMatch(skill2 -> skill2.equalsIgnoreCase(skills)));
        employeeMissingSkillset.setMissingSkills(employeeSkillset.getRequiredSkills());
        return employeeMissingSkillset;
    }
}

package com.amdocs.commanality.ddu.learning.assignment2.controller;

import com.amdocs.commanality.ddu.learning.assignment2.model.EmployeeMissingSkillset;
import com.amdocs.commanality.ddu.learning.assignment2.model.EmployeeSkillset;
import com.amdocs.commanality.ddu.learning.assignment2.service.ValidateSkillsApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidateSkills {

    @Autowired
    ValidateSkillsApplicationService validateSkillsApplicationService;

    @PostMapping("/employeemanagement/v1/validateEmployeeSkills")
    public ResponseEntity validateSkills(@RequestBody EmployeeSkillset employeeSkillset){
        EmployeeMissingSkillset employeeMissingSkillset = validateSkillsApplicationService.validateSkills(employeeSkillset);
        return new ResponseEntity(employeeMissingSkillset, HttpStatus.CREATED);
    }
}

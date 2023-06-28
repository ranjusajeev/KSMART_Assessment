package com.ikm.ksmart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ikm.ksmart.model.Employee;
import com.ikm.ksmart.repository.EmployeeRepository;



@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository EmpRep;
    public Employee createEmployee(Employee emp){

        return EmpRep.save(emp);

    }

    
}

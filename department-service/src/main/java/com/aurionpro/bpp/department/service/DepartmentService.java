package com.aurionpro.bpp.department.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aurionpro.bpp.department.entity.Department;
import com.aurionpro.bpp.department.repository.DepartmentRepository;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
    	log.info("Inside saveDepartment of DepartmentService");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
    	log.info("Inside saveDepartment of DepartmentService");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}

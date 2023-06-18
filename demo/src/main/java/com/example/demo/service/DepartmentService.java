package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;

@Service

public class DepartmentService {
    private final DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public List<Department> getDepartments() {
        return departmentRepository.findAll();
    }

    public Optional<Department> getDepartmentById(Long 	department_id) {
        return departmentRepository.findById(department_id);
    }

    public Department addDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public void deleteDepartment(Long department_id) {
        departmentRepository.deleteById(department_id);
    }


}

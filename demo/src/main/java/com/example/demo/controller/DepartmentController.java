package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DepartmentService;
import com.example.demo.entity.Department;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/Department")
@RequiredArgsConstructor

public class DepartmentController {
    private final DepartmentService departmentService;

    @GetMapping
    public ResponseEntity<?> getDepartments() {
        return ResponseEntity.ok(departmentService.getDepartments());
    }

    @GetMapping("/{department_id}")
    public ResponseEntity<?> getDepartmentById(@PathVariable Long department_id) {
        return ResponseEntity.ok(departmentService.getDepartmentById(department_id));
    }

    @PostMapping
    public ResponseEntity<?> addDepartment(@RequestBody Department department) {
        return ResponseEntity.ok(departmentService.addDepartment(department));
    }

    @DeleteMapping("/{department_id}")
    public ResponseEntity<?> deleteDepartment(@PathVariable Long department_id) {
        departmentService.deleteDepartment(department_id);
        return ResponseEntity.ok("Department Deleted");
    }

}

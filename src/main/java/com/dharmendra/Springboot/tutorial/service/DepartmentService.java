package com.dharmendra.Springboot.tutorial.service;

import com.dharmendra.Springboot.tutorial.entity.Department;

import java.util.List;

public interface DepartmentService {
   public  Department saveDepartment(Department department);

  public  List<Department> getAllDepartments();

    public Department getDepartmentById(Long departmentId);

    public void deleteDepartmentById(Long departmentId);

    public Department updateDepartmentById(Long departmentId, Department department);
}

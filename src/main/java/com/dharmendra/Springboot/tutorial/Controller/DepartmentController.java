package com.dharmendra.Springboot.tutorial.Controller;

import com.dharmendra.Springboot.tutorial.entity.Department;
import com.dharmendra.Springboot.tutorial.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    /*
     Since the below one is a post mapping which has the request body along with it. So We have an annotation @RequestBody which maps the json request body to department Object.
     */
    @PostMapping(path = "/departments")
    public Department saveDepartment(@RequestBody  Department department){
       return departmentService.saveDepartment(department);
    }

    @GetMapping(path = "/getDepartments")
    public List<Department> getDepartmentsList(){
        return departmentService.getAllDepartments();
    }

    @GetMapping(path = "/getDepartments/{id}")
    public Department getDepartmentById(@PathVariable("id") Long departmentId){
       return departmentService.getDepartmentById(departmentId);
    }

    @DeleteMapping(path = "/deleteDepartments/{id}")
    public String deleteDeparmentById(@PathVariable("id") Long departmentId){
         departmentService.deleteDepartmentById(departmentId);
         return "Deleted Sucessfully";
    }

    @PutMapping(path = "/updateDepartments/{id}")
    public Department updateDepartmentById(@PathVariable("id") Long departmentId, @RequestBody Department department){
        return departmentService.updateDepartmentById(departmentId, department);
    }
}

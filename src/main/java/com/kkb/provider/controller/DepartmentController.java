package com.kkb.provider.controller;

import com.kkb.provider.bean.Department;
import com.kkb.provider.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/provider/depart")
@RestController
public class DepartmentController {

    @Autowired
    private IDepartmentService service;

    @PostMapping("/save")
    public boolean saveHandle(@RequestBody Department department){
        return service.saveDepartment(department);
    }

    @DeleteMapping("/del/{id}")
    public boolean deleteHandle(@PathVariable("id") int id){
        return service.removeDepartmentById(id);
    }

    @PutMapping("/update")
    public boolean updateHandle(@RequestBody Department department){
        return service.modifyDepartment(department);
    }

    @GetMapping("/get/{id}")
    public Department getHandle(@PathVariable("id") int id){
        return  service.getDepartmentById(id);
    }

    @GetMapping("/list")
    public List<Department> listHandle(){
        return service.listAllDepartments();
    }
}

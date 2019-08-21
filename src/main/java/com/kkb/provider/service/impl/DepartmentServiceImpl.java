package com.kkb.provider.service.impl;

import com.kkb.provider.bean.Department;
import com.kkb.provider.repository.DepartmentRepository;
import com.kkb.provider.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements IDepartmentService {

    @Autowired
    private DepartmentRepository repository;

    @Override
    public boolean saveDepartment(Department department) {
        Department result = repository.save(department);
        if (result!=null){
            return true;
        }
        return false;
    }

    @Override
    public boolean removeDepartmentById(int id) {
        if (repository.existsById(id)){
            repository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public boolean modifyDepartment(Department department) {
        Department result = repository.save(department);
        if (result!=null){
            return true;
        }
        return false;
    }

    @Override
    public Department getDepartmentById(int id) {
        if (repository.existsById(id)){
            return repository.getOne(id);
        }
        Department department = new Department();
        department.setName("no this department");
        return department;
    }

    @Override
    public List<Department> listAllDepartments() {
        return repository.findAll();
    }
}

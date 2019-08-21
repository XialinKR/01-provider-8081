package com.kkb.provider.service;

import com.kkb.provider.bean.Department;

import java.util.List;

public interface IDepartmentService {

    boolean saveDepartment(Department department);

    boolean removeDepartmentById(int id);

    boolean modifyDepartment(Department department);

    Department getDepartmentById(int id);

    List<Department> listAllDepartments();
}

package com.kkb.provider.repository;

import com.kkb.provider.bean.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {
}

package com.zmdev.goldenbag.service;
import com.zmdev.goldenbag.domain.Department;

import java.util.List;

public interface OrginService {

    List<Department> findAll();
    void del(Long id);
    void save(Department department);
}

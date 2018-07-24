package com.zmdev.goldenbag.service.impl;

import com.zmdev.goldenbag.domain.Department;
import com.zmdev.goldenbag.domain.OrginRepository;
import com.zmdev.goldenbag.service.OrginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrginServiceImpl implements OrginService {

    public final OrginRepository orginRepository;

    @Autowired
    public OrginServiceImpl(OrginRepository orginRepository) {
        this.orginRepository = orginRepository;
    }
    public List<Department> findAll(){
        return orginRepository.findAll();
    }
    @Override
    public void save(Department department) {

        orginRepository.save(department);
    }

    @Override
    public void del(Long id) {
        orginRepository.deleteById(id);

    }

}

package com.zmdev.goldenbag.service.impl;

import com.zmdev.goldenbag.domain.UserRepository;
import com.zmdev.goldenbag.service.OrganService;
import org.springframework.stereotype.Service;

@Service
public class OrganServiceImpl implements OrganService {

    private final UserRepository userRepository;
    public OrganServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<Department> findAll(){

    }

}

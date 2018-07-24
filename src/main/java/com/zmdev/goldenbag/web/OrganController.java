package com.zmdev.goldenbag.web;


import com.zmdev.goldenbag.domain.Department;
import com.zmdev.goldenbag.domain.result.Response;
import com.zmdev.goldenbag.domain.result.ResponseData;
import com.zmdev.goldenbag.service.OrginService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orgin")
public class OrganController extends BaseController{
    private OrginService orginService;

    public OrganController (@Autowired OrginService orginService){
        this.orginService = orginService;
    }

    @GetMapping
    public List<Department> findAll() {
        return orginService.findAll();
    }
}

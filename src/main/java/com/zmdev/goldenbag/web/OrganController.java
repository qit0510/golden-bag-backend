package com.zmdev.goldenbag.web;


import com.zmdev.goldenbag.domain.Department;
import com.zmdev.goldenbag.domain.User;
import com.zmdev.goldenbag.domain.result.Response;
import com.zmdev.goldenbag.service.OrginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("add")
    public void add(@RequestBody Department department) {
        orginService.save(department);
        System.out.println("----------------------------------"+department);

    }

    @DeleteMapping("/{id}")
    public void del(@RequestParam Long id){
        System.out.println("----------------------------------"+id);
        orginService.del(id);
    }

}

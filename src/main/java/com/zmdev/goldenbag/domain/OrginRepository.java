package com.zmdev.goldenbag.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrginRepository  extends JpaRepository<Department, Long> {

    List<Department> findAll();


}

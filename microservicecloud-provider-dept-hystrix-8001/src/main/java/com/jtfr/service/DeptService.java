package com.jtfr.service;

import java.util.List;

import com.jtfr.entity.Dept;

public interface DeptService {
    
    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
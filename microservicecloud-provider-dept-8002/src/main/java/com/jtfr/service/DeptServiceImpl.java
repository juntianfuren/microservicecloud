package com.jtfr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jtfr.dao.DeptMapper;
import com.jtfr.entity.Dept;

@Service
public class DeptServiceImpl implements DeptService {
	@Autowired
	private DeptMapper dao;

	@Override
	public boolean add(Dept dept) {
		return dao.addDept(dept);
	}

	@Override
	public Dept get(Long id) {
		return dao.findById(id);
	}

	@Override
	public List<Dept> list() {
		return dao.findAll();
	}

}

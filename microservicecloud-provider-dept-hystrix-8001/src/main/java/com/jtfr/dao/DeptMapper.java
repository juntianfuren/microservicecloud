package com.jtfr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.jtfr.entity.Dept;

@Mapper // 特别注意 注解不要忘记了
public interface DeptMapper {
	public boolean addDept(Dept dept);

	public Dept findById(Long id);

	public List<Dept> findAll();
}
package com.jtfr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.jtfr.entity.Dept;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "DeptController:部门管理")
@RestController
@RequestMapping("/consumer")
public class DeptController_Consumer {
	private static final String REST_URL_PREFIX = "http://localhost:8001";

	@Autowired
	private RestTemplate restTemplate;

	@ApiOperation("添加部门")
	@RequestMapping(value = "/dept/add")
	public boolean add(Dept dept) {
		return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
	}

	@ApiOperation("获取指定部门")
	@RequestMapping(value = "/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
	}

	@ApiOperation("查询所有部门")
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/dept/list")
	public List<Dept> list() {
		return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
	}
}

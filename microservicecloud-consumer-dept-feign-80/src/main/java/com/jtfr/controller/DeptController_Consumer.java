package com.jtfr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jtfr.entity.Dept;
import com.jtfr.service.DeptClientService;


@RestController
@RequestMapping("/consumer")
public class DeptController_Consumer {
	
	@Autowired
	private DeptClientService service = null;

	@GetMapping(value = "/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		return this.service.get(id);
	}

	@GetMapping(value = "/dept/list")
	public List<Dept> list() {
		return this.service.list();
	}

	@PostMapping(value = "/dept/add")
	public Object add(Dept dept) {
		return this.service.add(dept);
	}
}

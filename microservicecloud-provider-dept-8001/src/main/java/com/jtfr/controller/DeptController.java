package com.jtfr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jtfr.entity.Dept;
import com.jtfr.service.DeptService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "DeptController:部门管理")
@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService service;

    @ApiOperation("添加部门")
    @PostMapping("/add")
    public boolean add(@RequestBody Dept dept) {
        return service.add(dept);
    }

    @ApiOperation("获取指定部门")
    @GetMapping("/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return service.get(id);
    }

    @ApiOperation("查询所有部门")
    @GetMapping("/list")
    public List<Dept> list() {
        return service.list();
    }

}

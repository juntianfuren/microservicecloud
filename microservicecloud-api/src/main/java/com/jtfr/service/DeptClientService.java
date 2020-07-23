
package com.jtfr.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.jtfr.entity.Dept;

@FeignClient("microservicecloud-dept")
public interface DeptClientService {

    @GetMapping("/dept/get/{id}")
    Dept get(@PathVariable("id") Long id);

    @GetMapping(value = "/dept/list")
    List<Dept> list();

    @PostMapping(value = "/dept/add")
    Object add(Dept dept);

}

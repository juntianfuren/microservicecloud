package com.jtfr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.jtfr.service"})
public class DeptFeignConsumer80_App {
	public static void main(String[] args) {
		SpringApplication.run(DeptFeignConsumer80_App.class, args);
	}
}
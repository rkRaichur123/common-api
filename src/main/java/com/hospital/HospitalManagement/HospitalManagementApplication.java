package com.hospital.HospitalManagement;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan
public class HospitalManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalManagementApplication.class, args);
	}

}

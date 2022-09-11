package com.sovadeveloper.policeService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PoliceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PoliceServiceApplication.class, args);
	}

}

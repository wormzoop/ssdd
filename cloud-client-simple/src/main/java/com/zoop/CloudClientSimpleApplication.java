package com.zoop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudClientSimpleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudClientSimpleApplication.class, args);
	}
}

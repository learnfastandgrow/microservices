package com.data.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SampleRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleRestApiApplication.class, args);
	}

}

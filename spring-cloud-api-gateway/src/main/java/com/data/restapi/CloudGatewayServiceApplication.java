package com.data.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;

import reactor.core.publisher.Mono;

@SpringBootApplication
public class CloudGatewayServiceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(CloudGatewayServiceApplication.class, args);
	}
	
	@Bean
	public GlobalFilter globalFilter() {
		return (exchange, chain) -> {
			System.out.println("First Global Filter");
			return chain.filter(exchange).then(Mono.fromRunnable(()-> {
				System.out.println("Second Global Filter");
			}));
		};
	}

}

package com.mgkLearnings.customerserviceV1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CustomerServiceV1Application {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceV1Application.class, args);
	}

}

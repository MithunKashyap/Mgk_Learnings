package com.ora.test.wartest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
@SpringBootApplication
public class WartestApplication {

	@GetMapping(path="/testWar", produces = "application/json")
	String check(){
		return "Success !!! API work agthide... Jai Maathe";
	}
	public static void main(String[] args) {
		SpringApplication.run(WartestApplication.class, args);
	}

}

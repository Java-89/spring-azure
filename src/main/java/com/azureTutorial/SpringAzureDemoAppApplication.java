package com.azureTutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureDemoAppApplication {

	public String message(){
		return "Congrats!! your app is deployed on azure successfully";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAzureDemoAppApplication.class, args);
	}

}

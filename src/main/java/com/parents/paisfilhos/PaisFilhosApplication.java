package com.parents.paisfilhos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class PaisFilhosApplication {
	
	@GetMapping
	public String getHomeTeste() {
		return "Pais e Filhos - API Home";
	}

	public static void main(String[] args) {
		SpringApplication.run(PaisFilhosApplication.class, args);
	}

}

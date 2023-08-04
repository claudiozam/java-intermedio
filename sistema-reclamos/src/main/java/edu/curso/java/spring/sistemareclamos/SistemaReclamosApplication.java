package edu.curso.java.spring.sistemareclamos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.curso.java.spring.sistemareclamos.repository.ClientesRepository;

@SpringBootApplication
public class SistemaReclamosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaReclamosApplication.class, args);	
	}

}

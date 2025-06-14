package com.bookstore.Project.with.Spring.Boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectWithSpringBootApplication {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver PostgreSQL carregado com sucesso!");
		} catch (ClassNotFoundException e) {
			System.err.println("Erro ao carregar o driver PostgreSQL: " + e.getMessage());
		}
		SpringApplication.run(ProjectWithSpringBootApplication.class, args);
	}

}

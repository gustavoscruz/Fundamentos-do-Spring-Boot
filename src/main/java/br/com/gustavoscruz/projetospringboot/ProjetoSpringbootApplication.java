package br.com.gustavoscruz.projetospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "br.com.gustavoscruz")
@SpringBootApplication
public class ProjetoSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoSpringbootApplication.class, args);
	}

}

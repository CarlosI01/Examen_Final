package thewosita.cj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
@OpenAPIDefinition
@SpringBootApplication
public class MongoCarlosAApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoCarlosAApplication.class, args);
	}

}

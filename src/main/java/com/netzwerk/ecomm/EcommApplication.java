package com.netzwerk.ecomm;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@Profile("dev")
//@EnableJpaRepositories(basePackages = "com.netzwerk.ecomm")
//@OpenAPIDefinition(info = @Info(title = "Ecomm API", version = "2.0", description = "Ecommerce Application"))
public class EcommApplication {

	public static void main(String[] args) {

//		System.setProperty("spring.devtools.restart.enabled", "false");

		System.out.println("starting app");
	//	System.setProperty("Spring.profiles.active","dev");
		SpringApplication.run(EcommApplication.class, args);
		System.out.println("Running app");
	}

//	@Bean
//	public Docket productApi() {
//		return new Docket(DocumentationType.SWAGGER_2).select()
//				.apis(RequestHandlerSelectors.basePackage("com.netzwerk.ecomm")).paths(PathSelectors.any()).build();
//	}

}

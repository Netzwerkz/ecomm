package com.netzwerk.ecomm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

//@EnableJpaRepositories(basePackages = "com.netzwerk.ecomm.repository")
//@OpenAPIDefinition(info = @Info(title = "Ecomm API", version = "2.0", description = "Ecommerce Application"))
public class EcommApplication {

	public static void main(String[] args) {

//		System.setProperty("spring.devtools.restart.enabled", "false");

		System.out.println("starting app");
		SpringApplication.run(EcommApplication.class, args);
		System.out.println("Running app");
	}
//
//	@Bean
//	public Docket productApi() {
//		return new Docket(DocumentationType.SWAGGER_2).select()
//				.apis(RequestHandlerSelectors.basePackage("com.netzwerk.ecomm")).paths(PathSelectors.any()).build();
//	}

}

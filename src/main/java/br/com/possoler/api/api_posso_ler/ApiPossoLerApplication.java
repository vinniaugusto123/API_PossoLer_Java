package br.com.possoler.api.api_posso_ler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class ApiPossoLerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiPossoLerApplication.class, args);
	}
}

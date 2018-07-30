package ua.logos;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootRestServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestServerApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
		return modelMapper();
	}
}

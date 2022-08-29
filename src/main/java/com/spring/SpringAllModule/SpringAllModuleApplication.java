package com.spring.SpringAllModule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@SpringBootApplication
@RestController
@EnableSwagger2
public class SpringAllModuleApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(SpringAllModuleApplication.class, args);
	}

	@RequestMapping("/")
	public String welcome() {
		return "Your Most Warm Welcome in Spring ";
	}
}

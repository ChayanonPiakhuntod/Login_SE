package com.sut.se.g13;

import com.sut.se.g13.Entity.*;
import com.sut.se.g13.Repository.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class SpringBootVueApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootVueApplication.class, args);
	}

	@Bean
	ApplicationRunner init(EmployeeRepository employeeRepository) {
		return args -> {
			Stream.of("se2562", "se2019", "sut2562").forEach(password -> {
				Employee employee = new Employee();
				employee.setPassword(password);
				employeeRepository.save(employee);
			});
		};
	}

}
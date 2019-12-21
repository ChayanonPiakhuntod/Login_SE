package com.sut.se.g13;

import com.sut.se.g13.Entity.*;
import com.sut.se.g13.Repository.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootVueApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootVueApplication.class, args);
	}

	@Bean
	ApplicationRunner init(EmployeeRepository employeeRepository) {
		return args -> {
			Employee infoemp1 = new Employee();
			infoemp1.setUsername("G13");
			infoemp1.setPassword("SE2562");
			employeeRepository.save(infoemp1);

			Employee infoemp2 = new Employee();
			infoemp2.setUsername("Bank");
			infoemp2.setPassword("031239");
			employeeRepository.save(infoemp2);
		};
	}

}
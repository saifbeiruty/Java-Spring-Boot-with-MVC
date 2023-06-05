package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping(path = "/")
	public static List<Student> hello() {
		return List.of(
				new Student(
						1L,
						"M",
						"Mar.ja@gmail.com",
						LocalDate.of(2000, Month.DECEMBER,5),
						21
				)
		);
	}
}

package com.employeeapp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.employeeapp.repository.EmployeeRepository;
@SpringBootApplication
public class EmployeeManageApplication implements CommandLineRunner {
	@Autowired
	private EmployeeRepository employeeRepository;
	public static void main(String[] args) {
		SpringApplication.run(EmployeeManageApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {

		
		/*
		 * Employee employee1 = new Employee("venky", "kantu","venkykantu", 25000,
		 * "developer", "5678902443", "venky.kantu@gmail.com", "Delhi"); Employee
		 * employee2 = new Employee("krithi", "das","krithidas", 10000, "tester",
		 * "5678902443", "krithi.das@gmail.com", "chennai"); Employee employee3 = new
		 * Employee("poulami", "mohan", "poulamimohan",15000, "ui", "8978902443",
		 * "poulami@gmail.com", "Bangolre"); Employee employee4 = new
		 * Employee("manikanta", "guptha", "manikantaguptha",18000, "devops",
		 * "5678902783", "mani.guptha@gmail.com", "Guntur"); Employee employee5 = new
		 * Employee("sai", "kumar", "saikumar",8000, "networking", "8678902443",
		 * "sai@gmail.com", "Vijayawada"); Employee employee6 = new Employee("hari",
		 * "nandan","harinandan", 6000, "supporter", "4478902443",
		 * "hari.nandan@gmail.com", "noida"); Employee employee7 = new
		 * Employee("vikash", "prabhu","vikashprabhu", 9000, "pega", "9678902443",
		 * "vikash@gmail.com", "hyderabad");
		 * 
		 * employeeRepository.save(employee1); employeeRepository.save(employee2);
		 * employeeRepository.save(employee3); employeeRepository.save(employee4);
		 * employeeRepository.save(employee5); employeeRepository.save(employee6);
		 * employeeRepository.save(employee7);
		 */
		 
	}
}

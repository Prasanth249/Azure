package com.nagarro.microserves;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AzureApplication {

	@Autowired
	private CustomerRepo repo;

	@GetMapping("/customer")
	public List<Customer> getStudent() {
		return repo.findAll();
	}

	@PostMapping("/addCustomer")
	public Customer addStudent(@RequestBody Customer customer) {

		return repo.save(customer);
	}
	public static void main(String[] args) {
		SpringApplication.run(AzureApplication.class, args);
	}

}

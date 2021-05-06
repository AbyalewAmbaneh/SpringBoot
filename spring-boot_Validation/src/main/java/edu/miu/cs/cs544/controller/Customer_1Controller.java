package edu.miu.cs.cs544.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.miu.cs.cs544.domain.Customer_1;
import edu.miu.cs.cs544.repository.Customer_1Repository;

@RestController
@RequestMapping("/Customers")
public class Customer_1Controller {
	@Autowired
	Customer_1Repository repository;

	@GetMapping
	public List<Customer_1> FindAll() {
		return repository.findAll();
	}
}

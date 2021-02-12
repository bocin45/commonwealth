package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Response;
import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;

@RestController
@RequestMapping(value = "/v1/customer")
public class CustomerController {

	@Autowired
	CustomerService userService;

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Customer> get(@RequestParam String id) {
		Optional<Customer> userOptional = userService.findById(Long.valueOf(id));
		ResponseEntity<Customer> response = new ResponseEntity<Customer>(userOptional.get(), HttpStatus.OK);
		return response;
	}

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Response> save(@RequestBody Customer customer) {
		return saveUpdate(customer);
	}

	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Response> update(@RequestBody Customer customer) {
		return saveUpdate(customer);
	}

	@DeleteMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Response> delete(@RequestParam String id) {
		Customer userData = new Customer(Long.valueOf(id));
		userService.delete(userData);
		return new ResponseEntity<Response>(new Response("Sucessfully Deleted", HttpStatus.OK), HttpStatus.OK);
	}

	private ResponseEntity<Response> saveUpdate(Customer customer) {
		userService.save(customer);
		return new ResponseEntity<Response>(new Response("Sucessfully Created", HttpStatus.OK), HttpStatus.OK);
	}
}

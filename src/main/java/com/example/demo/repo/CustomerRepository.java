package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Customer;

@Component
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}

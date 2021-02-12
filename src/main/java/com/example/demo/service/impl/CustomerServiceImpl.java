package com.example.demo.service.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.repo.CustomerRepository;
import com.example.demo.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository userRepository;

	@Override
	public Collection<Customer> findAll() {
		try {
			return (Collection<Customer>) userRepository.findAll();
		} catch (Exception e) {
			return Collections.EMPTY_LIST;
		}
	}

	@Override
	public Optional<Customer> findById(Long id) {
		try {
			return userRepository.findById(id);
		} catch (Exception e) {
			return Optional.empty();
		}
	}

	@Override
	public Customer save(Customer entity) {
		try {
			return userRepository.save(entity);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public void delete(Customer entity) {
		try {
			userRepository.delete(entity);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

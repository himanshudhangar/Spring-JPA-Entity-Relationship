package com.bridgelabz.springjpaentitymapping.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.springjpaentitymapping.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
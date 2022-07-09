package com.bridgelabz.springjpaentitymapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bridgelabz.springjpaentitymapping.entity.Customer;
import com.bridgelabz.springjpaentitymapping.entity.Item;
import com.bridgelabz.springjpaentitymapping.repository.CustomerRepository;
import com.bridgelabz.springjpaentitymapping.repository.ItemRepository;

@SpringBootApplication
public class SpringJpaEntityMapApplication implements CommandLineRunner{
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private ItemRepository itemRepository;
	
	public static void main(String[] args) {
		
		System.out.println("Hello World");
	
		SpringApplication.run(SpringJpaEntityMapApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Customer customer=new Customer("Tom");

		Item item1=new Item("Item1");
		Item item2=new Item("Item2");


		customer.getItems().add(item1);
		customer.getItems().add(item2);

	
		customerRepository.save(customer);
		
	}
	
	

}

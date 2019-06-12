package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;

@Component
public class ConsoleRunner implements CommandLineRunner {
	@Autowired
	private ProductRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(repo.getClass().getName());
		Product p=repo.save(new Product("A", 1.3));
		System.out.println("Product Id:"+p.getProdId());
		Product p1=repo.save(new Product("B", 2.3));
		System.out.println("Product Id:"+p1.getProdId());
		Product p2=repo.save(new Product("C", 3.3));
		System.out.println("Product Id:"+p2.getProdId());
	}

}

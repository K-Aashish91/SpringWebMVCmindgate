package com.sky.repository;

import java.util.ArrayList;
import java.util.List;

import com.sky.domain.Product;

public class ProductRepositoryImpl implements ProductRepository {
	
	private static List<Product> products = new ArrayList<Product>();
	
	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		System.out.println("in repository");
		products.add(product);

	}

	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return products;
	}

}

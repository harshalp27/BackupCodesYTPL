package com.collectionstest;

public class Product {

	private String name;
	private int weight;
	
	public Product(String name, int weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", weight=" + weight + "]";
	}
	
	
	
}

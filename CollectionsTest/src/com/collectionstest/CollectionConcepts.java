package com.collectionstest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionConcepts {

	public static void main(String[] args) {
		Product door = new Product("Wooden Floor", 35);
		Product floorPanel = new Product("floor Panel", 25);
		Product window = new Product("Glass Window", 10);
		
		Collection<Product> products = new ArrayList<Product>();
		Collection<Product> products1;
		
		Boolean x = products.add(door);
		//Boolean x1 = products.remove(door);
		System.out.println(x);
		products.add(floorPanel);
		products.add(window);
		//Boolean y = products.add(null);
	//	System.out.println(y);
		
		System.out.println(products);
		
// Iterator Interface		
	/*	Iterator<Product> productIterator = products.iterator();
		while(productIterator.hasNext()){
			Product product = productIterator.next();
			if (product.getWeight()>20){
				System.out.println(product);
			}
			else{
				//products.add(new Product("newDoor", 60));
				//productIterator.remove();
				//products.remove(product);
			}
		}*/
		
		System.out.println(products);
		
// For Each loop:
		for (Product product : products){
			products.add(new Product("newDoor", 60));
			System.out.println(product);
		}
		
	}
}

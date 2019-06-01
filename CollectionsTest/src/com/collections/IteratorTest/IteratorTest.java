package com.collections.IteratorTest;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest 
{
  public static void main(String[] args) 
  {
	List<String> names = new LinkedList<>();
	names.add("Rams");
	names.add("Posa");
	names.add("Chinni");
	
	// Getting Iterator
	Iterator<String> namesIterator = names.iterator();
		
	// Traversing elements
	while(namesIterator.hasNext()){
		
		if ((namesIterator.next()) == "Rams"){
			namesIterator.remove();
		}
		else{
			System.out.println(namesIterator.next());	
		}
	}	
	
  }
}


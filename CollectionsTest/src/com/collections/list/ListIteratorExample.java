package com.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIteratorExample {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		for(int i=0; i<5; i++) list.add(i);
		
		Iterator<Integer> iterator = list.iterator();
		
		//Java ArrayList constructor with initial capacity
		List<String> dictionaryWordsList = new ArrayList<String>(50000);


		//Creating my list from different collection source
		List<Integer> myList = new ArrayList<Integer>(list);
		
		//simple iteration
		while(iterator.hasNext()){
			int i = (int) iterator.next();
			System.out.print(i + ", ");
		}
		System.out.println("\n"+list);
		
		//modification of list using iterator
		iterator = list.iterator();
		
		while(iterator.hasNext()){
			int x =(int) iterator.next();
			System.out.println("number +" + x);
			//if(x%2 ==0) iterator.remove();
			list.set(3, 6);
			
		}
		System.out.println("printing list " +list);
		
		//changing list structure while iterating
		/*iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println("Starting add elements..");
			int x = (int) iterator.next(); //ConcurrentModificationException here
			if(x==1) list.add(10);
		}*/
	}

}
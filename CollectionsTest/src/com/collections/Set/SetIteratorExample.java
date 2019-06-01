package com.collections.Set;


import java.util.*;

public class SetIteratorExample
{
	public static void main(String[] args) 
	{

		Set<Integer> set = new HashSet<>();
		for(int i=0; i<5; i++) 
			set.add(i);
		
		System.out.println(set.size());
		set.add(null);
		set.add(null);
		set.add(null);
		System.out.println("After adding null" + set.size());
		Iterator iterator = set.iterator();

		//simple iteration
		while(iterator.hasNext()){
			int i = (int) iterator.next();
			System.out.print(i + ", ");
		}
		System.out.println("\n" + set);

		//modification of set using iterator
		iterator = set.iterator();
		while(iterator.hasNext()){
			int x = (int) iterator.next();
			if(x%2 ==0) iterator.remove();
		}
		System.out.println(set);

		//changing set structure while iterating
		iterator = set.iterator();
		while(iterator.hasNext()){
			//ConcurrentModificationException here
			int x = (int) iterator.next(); 
			if(x==1) set.add(10);
		}
	}
}


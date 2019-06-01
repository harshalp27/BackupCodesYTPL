package com.collections.ArrayList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo 
{
	public static void main(String[] args) 
	{
		/*LinkedList names = new LinkedList();
	names.add("Rams");
	names.add("Posa");
	names.add("Chinni");
    names.add(2011);
   	names.addFirst("hello");
	System.out.println("LinkedList content: " + names);
	System.out.println("LinkedList size: " + names.size());
	String s = (String) names.pollFirst();
	System.out.println("LinkedList content: " + names);
	System.out.println(s);*/

		List names = new LinkedList();
		names.add("Rams");
		names.add("Posa");
		names.add("Chinni");
		names.add(2011);

		System.out.println("LinkedList content: " + names);
		System.out.println("LinkedList size: " + names.size());
		
		System.out.println(names.get(1));
	}
}
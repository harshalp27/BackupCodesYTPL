package com.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {

	public static void main(String args[]) {
		List<String> vowels= new ArrayList<String>();
		
		//add example
		vowels.add("A");
		vowels.add("I");
		System.out.println(vowels);
		//let's insert E between A and I
		vowels.add(1,"E");
		System.out.println(vowels);
		
		List<String> list = new ArrayList<String>();
		list.add("O");
		list.add("U");
		System.out.println(list);
		
		vowels.removeAll(list);
		System.out.println("letters removeall = "+vowels+", list removeall= "+list);
		
		//appending list elements to letters
		vowels.addAll(list);
		System.out.println(vowels);
		System.out.println(list);
		System.out.println("Vowels list size = "+vowels.size());
		System.out.println("list list size = "+list.size());
		//clear example to empty the list
		list.clear();
		System.out.println("list list size = "+list.size());
		//size example
		System.out.println("letters list size = "+vowels.size());
		
		//set example
		vowels.set(2, "E");
		System.out.println(vowels);
		
		vowels.removeAll(list);
		System.out.println("letters removeall = "+vowels+", list removeall= "+list);
		
		//subList example
		vowels.clear();vowels.add("E"); vowels.add("E");vowels.add("I"); vowels.add("O");
		list = vowels.subList(0, 2);
		System.out.println("letters = "+vowels+", list = "+list);
		vowels.set(0, "A");
		System.out.println("letters = "+vowels+", list = "+list);
		list.add("U");
		System.out.println("letters = "+vowels+", list = "+list);
		
/*java.util.ConcurrentModificationException
		vowels.removeAll(list);
		System.out.println("letters = "+vowels+", list = "+list);*/
	}

}

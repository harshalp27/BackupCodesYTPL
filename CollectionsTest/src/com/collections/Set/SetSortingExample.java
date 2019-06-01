package com.collections.Set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;


import java.util.*;

public class SetSortingExample {

	public static void main(String[] args) {
		Set<Integer> intsSet = new HashSet<>();
		Random random = new Random();
	/*	for (int i = 0; i  {return (o2-o1);});
		System.out.println("Reverse Sorting: " + intsList2);
*/
		// Approach-3
		Set<Integer> sortedSet = new TreeSet<>(intsSet);
		System.out.println("Sorted Set: " + sortedSet);
	}
}


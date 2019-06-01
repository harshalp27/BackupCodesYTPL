package com.collections.linkedlistDeque;

import java.util.LinkedList;
import java.util.LinkedList;
import java.util.Deque;

public class LinkedListDequeOperationsDemo 
{
  public static void main(String[] args) 
  {
	Deque names = new LinkedList();
	System.out.println(names);
	System.out.println(names.size());
	names.add(2);
	names.addFirst(1);
	names.addLast(3);
	names.addFirst(0);
	names.addLast(4);
	names.clear();
	System.out.println("LinkedList content: " + names);
	System.out.println("LinkedList size: " + names.size());
	names.removeFirst(); //throws exception on empty list
	names.pollFirst(); // no exception if empty list
	//names.removeLast();
	
	System.out.println("LinkedList content: " + names);
	System.out.println("LinkedList size: " + names.size());	
  }
}

package com.collections.queue;


import java.util.*;

public class QueueElementOperation {
   public static void main(String[] args) {
		
	Queue<String> queue = new LinkedList<>();
	queue.add("one");
	queue.add("otwo");
	queue.add("three");
	queue.add("four");
		
	System.out.println(queue.element());
	System.out.println(queue);
	queue.clear();
	System.out.println(queue.element());
   }
}


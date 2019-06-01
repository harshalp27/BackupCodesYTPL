package com.collections.queue;



import java.util.*;

public class QueuePeekOperation {
   public static void main(String[] args) {
		
	Queue<String> queue = new LinkedList<>();
	queue.add("one");
	queue.add("two");
	
		
	System.out.println(queue.peek());
	System.out.println(queue);
	queue.clear();
	System.out.println(queue.peek());
   }
}



package com.collections.queue;


import java.util.*;

public class QueueRemoveOperation 
{
   public static void main(String[] args) 
   {		
	Queue<String> queue = new LinkedList<>();
	queue.offer("one");
	queue.offer("two");		
	System.out.println(queue);		
	System.out.println(queue.remove());
	System.out.println(queue.remove());		
	System.out.println(queue.remove());		
   }
}


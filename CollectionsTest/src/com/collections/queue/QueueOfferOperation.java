package com.collections.queue;


import java.util.concurrent.*;

public class QueueOfferOperation {
	   public static void main(String[] args) {
			
		BlockingQueue<String> queue = new ArrayBlockingQueue<>(2);

		System.out.println(queue.offer("one"));
		System.out.println(queue.offer("two"));
		System.out.println(queue);
		System.out.println(queue.offer("three"));
		System.out.println(queue);
	   }
	}


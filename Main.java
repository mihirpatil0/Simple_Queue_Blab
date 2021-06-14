package com.bridgelab;

public class Main
{
	public static void main(String[] args)
	{
		Queue<Integer> queue = new Queue<>();
		
		//enQueue elements inside Queue.
		queue.enQueue(56);
		queue.enQueue(30);
		queue.enQueue(70);
		
		//printing size of an queue.
		System.out.println("Size of the queue is : " + queue.size() +"\n");
		
		//printing all elements of queue.
		queue.displayQueue();
		System.out.println();
		
		//deQueue element from queue.
		System.out.println("An element deQueued : " + queue.deQueue() + "\n");
		
		//printing size of an queue.
		System.out.println("Size of the queue is : " + queue.size() +"\n");
		
		//printing all elements of queue.
		queue.displayQueue();
	} 
}

package com.bridgelab;

public class Queue<T> 
{
	private Node<T> front;
	private Node<T> rear;
	
	private int length;
	
	private static class Node<T>
	{
		private final T DATA;
		private Node<T> next;
		
		public Node(T DATA)
		{
			super();
			this.DATA = DATA;
			this.next = null;
		}
		
	}
	
	public void enQueue(T DATA)
	{
		if(front == null)
		{
			rear = new Node<T>(DATA);
			front = rear ;
		}
		else
		{
			rear.next = new Node<T>(DATA);
			rear = rear.next;
		}
		length++;
	}
	
	public T deQueue()
	{
		if(front != null)
		{
			T result = front.DATA;
			front = front.next;
			length--;
			return result;
		}
		return null;
	}
	
	public int size()
	{
		return length;
	}
	
	public void displayQueue()
	{
		Node<T> curretnNode = front;
		while(curretnNode != null)
		{
			System.out.print(curretnNode.DATA+ " ");
			curretnNode = curretnNode.next;
		}
	}
}

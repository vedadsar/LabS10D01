package Vjezbe;

import Vjezbe.StackInt.IntNode;



public class QueueInt {

	private IntNode head;
	private IntNode tail;
	
	public void push(int value){
		IntNode current = new IntNode(value);
		if(head == null)
			head = tail = current;
		else{
			tail.setNext(current);
			tail = current;
		}
	}
	
	public int pop(){
		if(head == null)
			throw new ArrayIndexOutOfBoundsException("nesto");
		int result =head.getValue();
		head = head.getNext();
		return result;
	}
	
	public int peek(){
		if(head == null)
			throw new ArrayIndexOutOfBoundsException("nesto");
		int result =head.getValue();
		return result;
	}
	
	public int getSize(){
		if(head == null)
			return 0;			
		return getSize(head, 1);
	}
	
	private int getSize(IntNode current, int counter){
		if(current.getNext() == null)
			return counter;
		return getSize(current.next	, counter + 1);
					
	}
	
	public boolean contains(int value){
		if(head == null)
			throw new IllegalArgumentException("Its null");
		return contains(value, head);
	}
	
	private boolean contains(int value, IntNode current){
		if(current == null) // IF we came to end of stack and didn't found value we return false
			return false;
	
		else if(current.getValue() == value) // If we found value in our list we return true
			return true;
	
		else // if we didnt come to end but didnt found value, we're using recursion to check for another element in list
			return contains(value, current.getNext());
	
					
		
}
	
	
	
	
	public static class IntNode{
		private int value;
		private IntNode next;
		
		public IntNode(int value){
			this.value = value;
		}
		
		public int getValue(){
			return value;
		}
		public IntNode getNext(){
			return next;
		}
		public void setNext(IntNode next){
			this.next = next;
		}
	
	
	}
}

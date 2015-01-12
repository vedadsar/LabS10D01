package Vjezbe;

public class TestClass {
	public static void main(String[] args) {
		
		StackInt s = new StackInt();
		
		s.push(1);
		s.push(3);
		s.push(1);
		s.push(5);
		s.push(2);
		
		System.out.println("Min: "+s.getMin());
		System.out.println("Pop: "+s.pop());
		
		System.out.println("Min: "+s.getMin());
		System.out.println("Pop: "+s.pop());
		
		System.out.println("Min: "+s.getMin());
		System.out.println("Pop: "+s.pop());
		
		System.out.println("Min: "+s.getMin());
		System.out.println("Pop: "+s.pop());
		
		System.out.println("Min: "+s.getMin());
		System.out.println("Pop: "+s.pop());
		
	
	}
}

package Vjezbe;

public class TestClass {
	public static void main(String[] args) {
		StackInt s = new StackInt();
		s.push(6);
		s.push(2);
		s.push(5);
		s.push(120);
		s.push(1);
		s.pop();			
		System.out.println(s.getMin());
	}
}

package Vjezbe;

public class TestClass {
	public static void main(String[] args) {
		QueueInt s = new QueueInt();
		s.push(5);
		s.push(55);
		s.push(12);
		s.push(120);
		s.push(100);
		
		
		System.out.println(s.pop());
		System.out.println(s.getSize());
		System.out.println(s.contains(54));
		System.out.println(s.contains(55));
	}
}

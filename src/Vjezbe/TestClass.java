package Vjezbe;

public class TestClass {
	public static void main(String[] args) {
		QueueInt s = new QueueInt();
		s.push(5);
		s.push(5);
		s.push(12);
		s.push(451);
		s.pop();
		s.pop();
		
		
		System.out.println(s.getSize());
	}
}

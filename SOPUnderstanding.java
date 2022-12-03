package Concepts;
// HAS A RELATIONSHIP with instance members 
// HAS A RELATIONSHIP with static members 
public class SOPUnderstanding {
	public static void main(String[] args) {
		A.b.m(); // A is a class, b is an object of class B, m() is a method inside class B
	}
}
class A {
	static B b = new B();// create object for B class inside A class ( A HAS-A B )
	static int x = 6;
	static void m()
	{
		System.out.println("Q");
	}
}
class B {
	int a = 5;
	void m() {
		System.out.println("q");
	}
}
// A --> System
// B -> PrintStream
// b -> out
//m() -->print()
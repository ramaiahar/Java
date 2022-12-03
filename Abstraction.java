package Concepts;

public class Abstraction {

	public static void main(String[] args) {

	}
}
// Abstraction - process of hiding method ( its also known as method hiding )
// Definition: Enforcing developer to implement abstract method in child class
// Keyword used for abstraction is "abstract"
// Minimum one method to maximum of all methods in a class can be abstract 

abstract class Ai // abstract class / partially implemented class
{
	abstract void m(); // abstract method or non implemented method

	void n() // non abstract method or implemented method
	{
		System.out.println("N");
	}
}

class Ba extends Ai {
	void m() // implementation is provided in child class for abstract method
				// m()
	{
		System.out.println("B");
	}
}

////////////////////////////////////////////////////////////////////////////////////////////

abstract class A2b // purpose of this class is to guide or supervise the child
					// class
// all its child class should definitely implement abstract method
{
	void bill() // transfer property
	{
		System.out.println("B");

	}

	abstract void tax(); // transfer template
}

class A2bIndia extends A2b {
	// implemented method will be inherited to child class
	// non implemented method needs implementation in child class
	void tax() // child class enforces the developer to implement the abstract method,
	// this can be called as contract/rule
	{
		System.out.println("5");
	}
}

class A2bUS extends A2b {
	void tax() {
		System.out.println("15");
	}
}

class A2bUK extends A2b{
	void tax() {
		System.out.println("10");
	}
}

//////////////////////////////////////////////////////////////////////////////

abstract class Xy // parent class being abstract class
{
	abstract void tamil();

	void telugu() {

	}
}

abstract class Yx extends Xy // child class being abstract class
{
	abstract void english();
}

class Zz extends Yx {
	void tamil() {

	}

	void english() {

	}
}

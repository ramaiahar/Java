package Concepts;
// there are 2 levels in java
// static means class level --> what ever is marked as static will be in class level and they don't require object 
// instance means object level --> what ever is not marked as static will be in object level and they require object 
// Note: this and super keywords are object level (only for instance members, they are not for static members)
// this and super will not work inside static methods 
// static members cant be inherited and overridden
public class StaticKeyword {
	int a = 1; // instance d v
	static int b = 2; // static d v

	static void m() // static non parameterized method without return type
	{
		System.out.println("Hi" + b); // static methods can use only static variables, they can't use instance variables
	}

	void n() // non static non parameterized method without return type
	{
		System.out.println("bye" + a + b); // non static methods can us both static and instance variables
	}
void show()
{
	System.out.println("Java");
}
	public static void main(String[] args) {

		m(); // static method doesn't require object for it's execution
		StaticKeyword obj = new StaticKeyword(); // Object creation 
		obj.n(); // method call
		obj.show(); // method call 
	}

}

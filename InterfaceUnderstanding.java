package Concepts;

public class InterfaceUnderstanding {

	public static void main(String[] args) {

	}
}

// if all the methods are abstract then its said to be an interface
// 100% abstraction
// completely opp to class coz class is 0% abstraction
// class should have only implemented methods
// interface should have only non implemented methods
// abstract class can have both
// interface is a keyword
interface I {
	public void m();

	public void n();

	public void p();
}

class J implements I {
	public void m() {
	}

	public void n() {
	}

	public void p() {
	}
}

class K implements I {
	public void m() {
	}

	public void n() {
	}

	public void p() {
	}
}

interface Tamil {

	public void m();

}

interface French extends Tamil {
	public void t();
}

abstract class Ar {

	abstract void m();

	void n() {

	}

	void p() {

	}
}

class PC {
	int a;
	int b;

	public PC(int a, int b) {
		this.a = a;
		this.b = b;
	}
}

class CC extends PC {
	int x;
	int y;

	public CC(int a, int b, int x, int y) {
		super(a, b);
		this.x = x;
		this.y = y;
	}
}

class This {
	int a = 8;
	int x = 7;

	int m() {
		//int a = 9;
		n(this.x);
		return this.a;
	}

	int n(int u) {
		return 4;
	}

}

class AAA {
	int a = 1;

	void m() {
		System.out.print(8);
	}
}

class BBB extends AAA {
	int a = 2;

	void m() {
		int a = 3;
		System.out.print(a); // local var
		System.out.print(this.a); // instance var of its own class or current class
		// current class - instance of its own 
		System.out.print(super.a); // instance var of its parent class
		super.m();
		this.m(); // or 
		m(); 
	}
}
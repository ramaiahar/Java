package Concepts;

public class LearnInterface {
	public static void main(String[] args) {
		A2BIndiaa b = new A2BIndiaa();
		b.menu();
		b.tax();
	}
}

interface A2Bb {
	public  void tax();
	public  void menu();
}

class A2BIndiaa implements A2Bb {
public	void tax() {
		System.out.println("5");
	}
public	void menu() {
		System.out.println("India menu");
	}
}

class A2BUSs implements A2Bb {
	public	void tax() {
		System.out.println("10");
	}
	public	void menu() {
		System.out.println("US menu");
	}
}

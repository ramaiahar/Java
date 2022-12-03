package Concepts;

public class ThisKeyword {

	public static void main(String[] args) {
		BB b = new BB();
		b.add();
	}

}

class AA {
	int x = 1;// parent class variable
}

class BB extends AA {
	int x = 2; // child class variable

	int add() {
		int x = 3; // local variable
		int a = x + this.x + super.x;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
		System.out.println(a);
		return a;

	}

}
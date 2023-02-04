package ComplexTopics;

public class DynamicBinding {

	public static void main(String[] args) {
		Vehicel v = new Car();
		v.m();
		v = new Bike();
		v.m();
		v = new Vehicel();
		v.m();
	}

}

class Vehicel {
	void m() {
		System.out.println("Vehicel");
	}
}

class Car extends Vehicel {
	void m() {
		System.out.println("Car");
	}

}

class Bike extends Vehicel {
	void m() {
		System.out.println("Bike");
	}

}
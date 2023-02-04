package ComplexTopics;

public class HasARelationship {

	public static void main(String[] args) {
		
		A.method();
		A.b.method();
		A.c.method();
	}
}

class A {
	static B b = new B();
	static C c = new C();

	static void method() {
		System.out.println("Function A");
	}
}

class B {
	void method() {
		System.out.println("Function B");
	}
}

class C {
	void method() {
		System.out.println("Function C");
	}
}
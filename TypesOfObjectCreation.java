package ComplexTopics;

public class TypesOfObjectCreation implements Cloneable {
	int a = 1;

	void m() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {

//		Using new keyword
		TypesOfObjectCreation obj1 = new TypesOfObjectCreation();
		System.out.println(obj1.a); // 1
		obj1.a = 2;
		System.out.println(obj1.a); // 2

		obj1.m();

//		Using clone() method
		try {
			TypesOfObjectCreation obj2 = (TypesOfObjectCreation) obj1.clone();
			System.out.println(obj2.a); // 2
			obj2.a = 3;
			System.out.println(obj2.a); // 3
			obj2.m();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

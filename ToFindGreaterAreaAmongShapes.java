package MyMath;

public class ToFindGreaterAreaAmongShapes {

	public static void main(String[] args) {
		double radius = 1.5;
		double areaOfCircle = 3.14 * radius * radius;
		double side = 2;
		double areaOfSquare = side * side;
		double difference = areaOfCircle - areaOfSquare;
		if (difference > 0)
			System.out.println("Area Of Circle is greater");
		else
			System.out.println("Area Of Square is greater");
	}
}
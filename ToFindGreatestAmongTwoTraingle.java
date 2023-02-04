package MyMath;

public class ToFindGreatestAmongTwoTraingle {

	double checkGreatestSize() {
		double height1 = 7.0;
		double breadth1 = 5.0;
		double height2 = 5.0;
		double breadth2 = 7.0;
		double areaOfTriangle1 = 0.5 * height1 * breadth1;
		double areaOfTriangle2 = 0.5 * height2 * breadth2;
		double difference = areaOfTriangle1 - areaOfTriangle2;
		double greatestArea = difference >= 0 ? areaOfTriangle1 : areaOfTriangle2;
		System.out.println(greatestArea);
		return greatestArea;
	}

	public static void main(String[] args) {

		ToFindGreatestAmongTwoTraingle obj = new ToFindGreatestAmongTwoTraingle();
		obj.checkGreatestSize();
	}

}

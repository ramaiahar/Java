package Array;

public class DoubleForLoopInAnArray {

	public static void main(String[] args) {
		int x[] = { 555, 333, 100 };
		// Linear search--> take one element and compare it against or with  other elements 
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				System.out.println(x[i] + "     " + x[j]);
			}
		}
	}
}
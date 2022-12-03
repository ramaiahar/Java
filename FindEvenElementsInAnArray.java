package Array;

public class FindEvenElementsInAnArray {

	public static void main(String[] args) {
		int x[] = { 5, 4, 7, 6, 9, 10 };
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 == 0) {
				System.out.println(x[i]);
			}
		}
	}
}
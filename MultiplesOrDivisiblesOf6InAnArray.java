package Array;

public class MultiplesOrDivisiblesOf6InAnArray {

	public static void main(String[] args) {
		int a[] = { 567, 32, 972, 90, 437, 67 };
		int num = 6;

		for (int i = 0; i < a.length; i++) {
			if (a[i] % num == 0) {
				System.out.println(a[i]);
			}
		}

	}

}

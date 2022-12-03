package Array;

public class MinElementInAnArray {

	public static void main(String[] args) {
		int a[] = { 18, 5, 6, 99, 10, 7 };
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (min > a[i])
				min = a[i];
		}
		System.out.println(min);
	}
}
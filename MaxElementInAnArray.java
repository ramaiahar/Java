package Array;

public class MaxElementInAnArray {

	public static void main(String[] args) {
		int a[] = { 18, 5, 6, 99, 10, 7 };
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (max < a[i])
				max = a[i];
		}
		System.out.println(max);
	}
}
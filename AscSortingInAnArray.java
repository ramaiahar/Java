package Array;

public class AscSortingInAnArray {

	public static void main(String[] args) {
		int a[] = { 5, 7, 3, 6, 8, 9, 2, 1, 3, 4, 5 };
		System.out.println("Before sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("\nAfter sorting");
		for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " ");
		}
	}
}
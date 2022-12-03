package Array;

public class RemoveDuplicatesInAnArray {

	public static void main(String[] args) {
		int a[] = { 8, 5, 2, 8, 5, 7, 8, 9, 5, 7, 9 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					a[j] = 0;// removing duplicate element
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				System.out.print(a[i] + "  ");
			}
		}
	}
}
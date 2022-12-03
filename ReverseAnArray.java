package Array;

public class ReverseAnArray {

	public static void main(String[] args) {
		int a[] = { 8, 5, 2, 3 };
		for (int i = 0; i < a.length / 2; i++) {
			int temp = a[i];
			a[i] = a[a.length - 1 - i];
			a[a.length - 1 - i] = temp;
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				System.out.print(a[i] + "  ");
			}
		}
	}
}
package Array;

public class ToFindMidElementInAnArray {

	public static void main(String[] args) {
		int a[] = { 18, 5, 6, 9, 10, 7 };
		if (a.length % 2 == 0) {
			System.out.println(a[a.length / 2]);
			System.out.println(a[a.length / 2 - 1]);
		} else {
			System.out.println(a[a.length / 2]);
		}
	}
}
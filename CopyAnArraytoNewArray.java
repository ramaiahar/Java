package Array;

public class CopyAnArraytoNewArray {

	public static void main(String[] args) {
		int a[] = { 18, 5, 6, 99, 10, 7 };
		int b[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
			System.out.print(b[i] + " ");
		}
	}
}
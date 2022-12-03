package Array;

public class MergeTwoArrayIntoOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 18, 5, 6, 99, 10, 7 };
		int b[] = { 2, 5, 7, 8, 912, 34 };
		int c[] = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			c[a.length + i] = b[i];
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + "  ");
		}
	}
}
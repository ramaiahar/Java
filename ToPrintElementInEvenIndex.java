package Array;

public class ToPrintElementInEvenIndex {

	public static void main(String[] args) {

		int a[] = { 5, 3, 7, 17, 8, 1, 10, 9 };
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				System.out.println(i+ " ===> "+a[i]);
			}
		}
	}
}


// Note:
// Even index  --> i % 2 == 0
// Even elements --> a[i] % 2  == 0
// Odd index  --> i % 2 != 0
// Odd elements --> a[i] % 2  != 0
package Array;

public class ToCountMultiplesOf6 {

	public static void main(String[] args) {
		int count = 0;
		int a[] = { 567, 32, 972, 90, 437, 67 };
		int num = 6;

		for (int i = 0; i < a.length; i++) {
			if (a[i] % num == 0) {
				count = count + 1;
			}
		}
		System.out.println(count);

	}

}

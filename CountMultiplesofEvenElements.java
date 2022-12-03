package Array;

public class CountMultiplesofEvenElements {

	public static void main(String[] args) {
		int count = 0;
		int x[] = { 5, 4, 7, 6, 9, 10 };
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 == 0) {

				count = count + 1;
			}
		}
		System.out.println(count);
	}
}
// Counter logic --> to know how many times that particular event has occurred
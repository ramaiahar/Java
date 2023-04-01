package MyArray;

public class SplitIntoOddEvenArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 4, 3, 5, 7, 6, 8, 9, 2, 3, 4, 8 };

		int evenCounter = 0, oddCounter = 0;
		for (int i : arr) {

			if (i % 2 == 0)
				evenCounter++;
			else
				oddCounter++;
		}

		int evenArr[] = new int[evenCounter];
		int oddArr[] = new int[oddCounter];
		int j = 0, k = 0;
		for (int i : arr) {
			if (i % 2 == 0) {
				evenArr[j] = i;
				j++;
			} else {
				oddArr[k] = i;
				k++;
			}
		}

		for (int i : evenArr)
			System.out.print(i + " ");
		System.out.println();
		for (int i : oddArr)
			System.out.print(i + " ");
	}
}
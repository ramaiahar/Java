package MyArray;

public class MeanMedianMode {

	public static void main(String[] args) {

		int a[] = { 9, 3, 1, 8, 3, 6 };
		double sum = 0;
		for (int i : a)
			sum = sum + i;

		double mean = sum / a.length;
		System.out.println("Mean :" + mean);

        //sorting array
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Range :" + (a[a.length - 1] - a[0]));
		System.out.println("Median :" + ((a[(a.length / 2) - 1] + a[a.length / 2])) / 2.0);


		int maxcount = 0;
		int mode = 0;
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}

			if (count > maxcount) {
				maxcount = count;
				mode = a[i];
			}
		}
		System.out.println("Mode :" + mode);

	}
}
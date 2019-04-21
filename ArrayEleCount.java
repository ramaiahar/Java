package com.pack1;

public class ArrayEleCount {

	public static void main(String[] args) {
		int a[] = { 6, 8, 3, 7, 5, 2, 6, 8, 8, 9, 3 };
		for (int i = 0; i < a.length; i++) {
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j] && a[i] != 0) {
					count = count + 1;
					a[j] = 0;
				}
			}

			if (a[i] != 0)
				System.out.println(a[i] + "  " + count);
		}

	}

}

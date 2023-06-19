package MyArray;

import java.util.*;

public class SecondMaxElement {

	public static void main(String[] args) {
		// Type 1 with sorting
		int a[] = { 6, 4, 6, 1, 2, 3 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if(a[i]==a[j])
				{
					a[j]=0;
				}
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	System.out.println("2nd max. element is :" + a[1]);

		// type 2 without sorting
		int num[] = { 3, 6, 5, 9, 7, 10 };
		int highest = 0, secondHighest = 0;

		for (int i = 0; i < num.length; i++) {
			if (num[i] > highest) {
				secondHighest = highest;
				highest = num[i];
			}

			if (num[i] < highest && num[i] > secondHighest) {
				secondHighest = num[i];
			}
		}

		System.out.println("Second highest " + secondHighest);

		// Type 3 using collection - Expensive operation

		int arr[] = { 6, 9, 7, 5, 2, 1, 4 };
		Set set = new TreeSet<Integer>();
		for (int i : arr)
			set.add(i);
		List list = new ArrayList<Integer>();
		list.addAll(set);
		System.out.println("Second max ele: "+list.get(list.size()-2));

	}
}

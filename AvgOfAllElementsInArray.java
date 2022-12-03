package Array;

public class AvgOfAllElementsInArray {

	public static void main(String[] args) {

		int a[] = { 10, 5, 7, 3, 5 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i]; // cumulative  addition of elements in an array 
		}

		System.out.println("Sum "+sum);  // sum 
		
		System.out.println("Count "+a.length);  // count 

		System.out.println("Avg "+sum/a.length);  // avg or sum/count 
	}

}

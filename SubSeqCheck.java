package MyArray;
//Java program to check if an array is subarray of another array
public class SubSeqCheck {
	// Function to check if an array is subarray of another array
	static boolean isSubArray(int A[], int B[], int n, int m) {
		// Two variables to traverse the arrays
		int i = 0, j = 0;
		// Traverse both arrays simultaneously
		while (i < n && j < m) {
			// If element matches, increment both variables
			if (A[i] == B[j]) {
				i++;
				j++;
				// If array B is completely traversed
				if (j == m)
					return true;
			}
			// If not, increment i and reset j
			else {
				i = i - j + 1;
				j = 0;
			}
		}
		return false;
	}
	// Driver Code
	public static void main(String arr[]) {
		int A[] = { 2, 3, 0, 5, 1, 1, 2 };
		int n = A.length;
		int B[] = { 3, 0, 5, 1 };
		int m = B.length;

		if (isSubArray(A, B, n, m))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
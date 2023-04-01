package MyArray;

public class SubSeqCheck {

	static boolean isSubArray(int A[], int B[]) {
		int lhs = B.length;
		int rhs = 0;

		for (int i : A) {
			for (int j : B) {
				if (i == j) {
					rhs++;
				}
			}
		}

		if (lhs == rhs)
			return true;
		else
			return false;

	}

	public static void main(String arr[]) {
// Array elements shouldn't have duplicates 
		//(Remove duplicates before checking sub sequence)
		int A[] = { 2, 3, 0, 5, 1, 2 };
		int B[] = { 3, 0, 5, 1 };

		if (isSubArray(A, B))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}

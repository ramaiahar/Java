package Tasks;

public class FirstRepeatingElementsInAnArray {

	public static void main(String[] args) {
int arr[] = { 225, 669, 996, 336, 6547, 69, 25, 336, 69, 96, 69, 25 };

		int temp = 0;
		abc: for (int i = 0; i < arr.length; i++) {// select an element
			for (int j = i + 1; j < arr.length; j++) {// traverse ahead and check for duplicate
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
					temp = 1;
					break abc;
				}
			}
		}
		if (temp == 0)
			System.out.println("No repeating integer found");
	}
}
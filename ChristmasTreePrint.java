package Pattern;

public class ChristmasTreePrint {

	public static void main(String[] args) {

		int a = 5;

		for (int k = 1; k <= 3; k++) {
			for (int i = 1; i <= a; i++) {
				for (int j = 1; j <= a - i; j++) {
					System.out.print(" ");

				}
				for (int j = 1; j <= i; j++) {
					System.out.print("* ");

				}
				System.out.println();
			}
		}

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= a; j++) {
				if (j == 5)
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();
		}
	}

}

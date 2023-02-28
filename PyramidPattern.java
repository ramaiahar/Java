package Pattern;

public class PyramidPattern {

	public static void main(String[] args) {
				int n = 5;
		for (int i = 1; i <= n; i++) {
			// printing space
			for (int j = i; j <= n; j++) {
				System.out.print(" ");
			}
			// printing star
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
   } 
}

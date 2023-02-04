package MyString;

import java.util.Arrays;

public class StringArrayToString {
	public static void main(String args[]) {
		String s[] = { "My", "Name", "Is", "Ram" };
		// Using Predefined methods
		String x = Arrays.toString(s);
		System.out.println(x);
		// Using Using defined methods
		String y = "";
		for (String i : s)
			y = y + i+" ";
		System.out.println(y);
	}
}
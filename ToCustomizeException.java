package Concepts;

import java.io.IOException;

public class ToCustomizeException {

	void m(int age) throws IOException 
	{
		if(age < 18)
		{
			throw new IOException("Age is less than 18");
		}
		else
		{
			// insert code here 
		}
	}
		
	public static void main(String[] args) {
	ToCustomizeException a = new ToCustomizeException();
	try {
		a.m(16);
	} catch (IOException e) {
		e.printStackTrace();
		System.out.println(e);
		// insert your code here 
	}
	
	}
}

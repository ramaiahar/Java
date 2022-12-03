package Array;

public class ToFindCountOfEachElements {

	public static void main(String[] args) {
		int a[] = { 5, 7, 3, 6, 8,9 ,5,9, 2, 1, 3, 4, 5 };

		int count = 0;
		for (int i = 0; i < a.length; i++) {
		count = 1;
			for (int j = 1+i; j < a.length; j++) {
				if (a[i] == a[j])
				{
					count++;
					a[j]=0;
				}
			}
			if(a[i]!=0)
			System.out.println(a[i]+" is present "+count+ " times");
		}
	}

}

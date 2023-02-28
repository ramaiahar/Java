package Tasks;

public class FirstNonRepeatingElementsInAnArray {

	public static void main(String[] args) {
int array[] = {225, 669, 996, 336, 6547, 669, 225, 336, 669, 996, 669, 225 };

		//Creating the count array
	      int countArray[] = new int[array.length];
	      for(int i=0; i<array.length; i++) {
	         countArray[i] = 0;
	      }
	      for(int i=0; i<array.length; i++) {
	         for(int j=0; j<array.length;j++) {
	            if(i!=j && array[i]==array[j]) {
	               countArray[i]=countArray[i]+1;
	            }
	         }
	      }
	      //First non-repeating element in the array
	      for(int i=0; i<array.length; i++) {
	         if(countArray[i]==0) {
	            System.out.println(array[i]);
	            break;
	         }
	      }
	}

}

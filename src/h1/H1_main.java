package h1;

public class H1_main {

	public static void main(String[] args) {
		int[] myArray = {5, 6, 7, 10} ;
		
		int[] reversed = new int[myArray.length];
		for (int i = 0; i < myArray.length; i++) {
			  reversed[i] = myArray[myArray.length - 1 - i];
        }

       System.out.print("Vorher: ");
       for (int i = 0; i <myArray.length; i++) {
    	   System.out.print(myArray[i] + " ");
    	   
       }
 System.out.print("Nachher: ");
 for (int i = 0; i < reversed.length; i++) {
	 System.out.print(reversed[i] + " ");
 }
		System.out.println();
			
		
		
		
		
		
		
		

	}

}

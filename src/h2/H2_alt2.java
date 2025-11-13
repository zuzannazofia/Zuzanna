package h2;

public class H2_alt2 {

	public static void main(String[] args) {
		int Jahr = 2016;
		boolean schalt = false;
		
		if ((Jahr % 4 ==0 && Jahr % 100 !=0) || (Jahr % 400 == 0)) {
			schalt = true;
		} else {
			schalt = false;
		}
		
		System.out.println("Jahr: " + Jahr);
		System.out.println("Schaltjahr: " + schalt);
		

	}

}

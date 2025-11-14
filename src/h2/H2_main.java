package h2;

public class H2_main {

	public static void main(String[] args) {
		boolean x;
		boolean y;
		boolean a;
		boolean b;
		boolean c;
		int input = 10;
		
		if (input == 11 || input == 10) {
		    x = true;
		    
		} else {
			x = false;
			
		}
		if (input == 11 || input == 1) {
			y = true;
			
		} else {
			y = false;
			
		}
		
		boolean E1 = x;
		boolean E2 = y;
		boolean E3 = (x != y);

		a = (E1 && E2);
		
		b = (E1 || E3);
		
		c = !y;
		
		System.out.println("input: " + input);
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
	}

}

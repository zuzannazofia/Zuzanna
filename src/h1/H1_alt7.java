package h1;

public class H1_alt7 {

	public static void main(String[] args) {
		
		Bruch b1 = new Bruch(25,5);
		b1.shorten();
		System.out.println(b1);
		
		Bruch b2 = new Bruch(8,12);
		b2.shorten();
		System.out.println(b2);
		
		Bruch b3 = new Bruch(4,3);
		b3.shorten();
		System.out.println(b3);
		
		Bruch c1 = new Bruch(5,3);
		Bruch c2 = new Bruch(15,9);
		System.out.println(c1.hasSameValueAs(c2));
		
		
		
				

	}

}

package h1;

public class H1_main {

	public static void main(String[] args) {
		Zahl z = new Zahl();
		
		z.num =80;
		
		z.setEven();
		z.setPositive();
		z.setSmall();
		
		System.out.println("num= " + z.num);
		System.out.println("num= " +z.even);
		System.out.println("num= " +z.positive);
		System.out.println("num= " +z.small);
		

	}

}

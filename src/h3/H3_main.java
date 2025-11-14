package h3;

public class H3_main {

	public static void main(String[] args) {
		float celsiusFloat = 30;
		float fahrenheitFloat ; 
		double celsiusdouble = 5;
		double fahrenheitdouble ;
		
		fahrenheitFloat = celsiusFloat * 9/5 + 32;
		fahrenheitdouble = celsiusdouble * 9/5 + 32;
		
		System.out.println("Float Fahrenheit: " + fahrenheitFloat);
		System.out.println("Double Fahrenheit: " + fahrenheitdouble);
		

	}

}

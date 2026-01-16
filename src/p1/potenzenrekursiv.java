package p1;

public class potenzenrekursiv {
public static int potenz (int basis, int exponent) {
	if(exponent == 0) return 1;
	return basis * potenz(basis, exponent - 1);
}
public static void main (String[] args) {
	System.out.println(potenz(2, 5));
	
}
}

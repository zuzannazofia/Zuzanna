package h3;

public class H3_main {

	public static void main(String[] args) {
		int max = 80;
		int fix = 40;
		int wartend = 30;
		boolean istVoll = false;
		
		
		while (fix < max && wartend > 0) {
			fix = fix + 1;
			wartend = wartend - 1;
		}
		
		if (fix == max) {
			istVoll = true;
		} else {
			istVoll = false;
		}
		
		System.out.println("Fixplatze vergeben: " + fix);
		System.out.println("Wartende ubrig: " + wartend);
		System.out.println("Ist voll: " + istVoll);

	}

}

package p1;

public class P12_main1311 {

	public static void main(String[] args) {
		int stockwerk = 2;
		
		System.out.println("Hochste Etage : 3");
		
		switch (stockwerk) {
		case 3:
			System.out.println("Kinderbekleidung");
			
		case 2:
			System.out.println("Herrenbekliedung");
			
		case 1:
			System.out.println("Damenbekleidung");
			
		case 0:
			System.out.println("Angebote");
			break;
		
		case -1:
			System.out.println("Parkhaus");
			
		default:
			System.out.println("unbekannt");
		}

	}

}

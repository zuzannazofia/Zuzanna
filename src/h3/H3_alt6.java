package h3;

public class H3_alt6 {

	public static void main(String[] args) {
		
		Mensch s = new Mensch();
		
		s.setName("Mia");
		s.setGebJahr(2009);
		s.setAlter();
		
		System.out.println(s.getName());
		System.out.println(s.getGebJahr());
		System.out.println(s.getAlter());
	}

}

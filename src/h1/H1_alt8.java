package h1;

public class H1_alt8 {

	public static void main(String[] args) {
	    PrioListe liste = new PrioListe();

        Patient A = new Patient("A", 1);
        Patient B = new Patient("B", 10);
        Patient C = new Patient("C", 5);
        Patient D = new Patient("D", 7);

        liste.addPatient(A);
        liste.addPatient(C);
        liste.addPatient(B);
        liste.addPatient(D);

        System.out.println("Reihenfolge in myList nach addPatient:");
        System.out.println("Position A: " + liste.getPosition(A));
        System.out.println("Position C: " + liste.getPosition(C));
        System.out.println("Position D: " + liste.getPosition(D));
        System.out.println("Position B: " + liste.getPosition(B));

        System.out.println("Naechster Patient: " + liste.getNextPatient());
        System.out.println("Naechster Patient: " + liste.getNextPatient());
    }
}
	



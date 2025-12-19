package h2;

import java.util.ArrayList;

public class H2_main {

    public static void main(String[] args) {

        Bus busA = new Bus();
        Bus busB = new Bus();

        Passenger anna = new Passenger("Anna", 3, true);
        Passenger ben = new Passenger("Ben", 2, true);
        Passenger clara = new Passenger("Clara", 2, false);

        busA.enterBus(anna);
        busA.enterBus(ben);
        busA.enterBus(clara);

        System.out.println("Bus A: " + busA);
        System.out.println("Bus B: " + busB);

        busA.nextStop();
        busA.nextStop();

        System.out.println("Bus A nach zwei Stops: " + busA);

        String[] transferNames = { "Anna", "Clara" };
        busA.transferPassengers(busB, transferNames);

        System.out.println("Bus A nach Transfer: " + busA);
        System.out.println("Bus B nach Transfer: " + busB);

        ArrayList<Passenger> noTicket = busB.findPassengersWithoutTickets();
        System.out.println("Ohne Ticket entfernt: " + noTicket);
        System.out.println("Bus B final: " + busB);
    }
}
		

	



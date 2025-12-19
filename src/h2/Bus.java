package h2;

import java.util.ArrayList;

public class Bus {
	ArrayList<Passenger> passengers;

    public Bus() {
        passengers = new ArrayList<>();
    }

    public void enterBus(Passenger p) {
        passengers.add(p);
    }

    private void exitBus() {
        int i = 0;
        while (i < passengers.size()) {
            Passenger p = passengers.get(i);
            if (p.planned == p.visited) {
                passengers.remove(i);
            } else {
                i++;
            }
        }
    }

    public void nextStop(Passenger[] boarding) {
        for (Passenger p : passengers) {
            p.visited++;
        }
        exitBus();
        if (boarding != null) {
            for (Passenger p : boarding) {
                passengers.add(p);
            }
        }
    }

    public void nextStop() {
        nextStop(new Passenger[0]);
    }

    public ArrayList<Passenger> findPassengersWithoutTickets() {
        ArrayList<Passenger> removed = new ArrayList<>();
        int i = 0;
        while (i < passengers.size()) {
            Passenger p = passengers.get(i);
            if (!p.ticket) {
                removed.add(p);
                passengers.remove(i);
            } else {
                i++;
            }
        }
        return removed;
    }

    public void transferPassengers(Bus otherBus, String[] passengerNames) {
        if (passengerNames == null || passengerNames.length == 0) {
            return;
        }
        ArrayList<Passenger> toTransfer = new ArrayList<>();
        int i = 0;
        while (i < passengers.size()) {
            Passenger p = passengers.get(i);
            boolean match = false;
            for (String name : passengerNames) {
                if (p.name.equals(name)) {
                    match = true;
                    break;
                }
            }
            if (match) {
                toTransfer.add(p);
                passengers.remove(i);
            } else {
                i++;
            }
        }
        for (Passenger p : toTransfer) {
            otherBus.enterBus(p);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < passengers.size(); i++) {
            sb.append(passengers.get(i).name);
            if (i < passengers.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}
	


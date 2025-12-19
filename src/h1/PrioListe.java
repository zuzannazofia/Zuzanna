package h1;

import java.util.ArrayList;

public class PrioListe {

    ArrayList<Patient> myList;

    public PrioListe() {
        myList = new ArrayList<>();
    }

    public void addPatient(Patient p) {
        if (myList.isEmpty()) {
            myList.add(p);
            return;
        }

        int i = 0;
        while (i < myList.size() && myList.get(i).prio < p.prio) {
            i++;
        }
        myList.add(i, p);
    }

    public Patient getNextPatient() {
        if (myList.isEmpty()) {
            return null;
        }
        return myList.remove(0);
    }

    public int getPosition(Patient p) {
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) == p) {
                return i;
            }
        }
        return -1;
    }
}



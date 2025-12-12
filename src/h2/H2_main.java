package h2;

public class H2_main {

	public static void main(String[] args) {
	   
		SimpleList myList = new SimpleList();

        myList.append(12);
        myList.append(45);
        myList.append(66);
        myList.append(12);
        myList.append(45);
        myList.append(60);

        System.out.println("nach append:     " + myList);

        myList.insertAfter(45, 4);
        System.out.println("nach insertAfter(45,4): " + myList);

        Node first45 = myList.findFirst(45);
        if (first45 != null) {
            System.out.println("findFirst(45):   " + first45.value);
        }

        myList.delete(45);
        System.out.println("nach delete(45): " + myList);

        Node first = myList.getFirst();
        Node last = myList.getLast();
        System.out.println("getFirst():      " + (first == null ? "null" : first.value));
        System.out.println("getLast():       " + (last == null ? "null" : last.value));


	}

}

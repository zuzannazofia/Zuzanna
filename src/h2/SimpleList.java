package h2;

public class SimpleList {

    Node head;

    public SimpleList() {
        head = new Node(Integer.MIN_VALUE);
        head.next = null;
    }

    public Node getFirst() {
        return head.next;
    }

    public Node getLast() {
        if (head.next == null) {
            return null;
        }
        Node current = head.next;
        while (current.next != null) {
            current = current.next;
        }
        return current;
    }

    public void append(int newValue) {
        Node newNode = new Node(newValue);
        if (head.next == null) {
            head.next = newNode;
            return;
        }
        Node last = head.next;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    public Node findFirst(int value) {
        Node current = head.next;
        while (current != null) {
            if (current.value == value) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public boolean insertAfter(int preValue, int newValue) {
        Node current = head.next;
        while (current != null && current.value != preValue) {
            current = current.next;
        }
        if (current == null) {
            return false;
        }
        Node newNode = new Node(newValue);
        newNode.next = current.next;
        current.next = newNode;
        return true;
    }

    public boolean delete(int value) {
        if (value == Integer.MIN_VALUE) {
            return false;
        }
        Node prev = head;
        Node current = head.next;
        while (current != null && current.value != value) {
            prev = current;
            current = current.next;
        }
        if (current == null) {
            return false;
        }
        prev.next = current.next;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head.next;
        while (current != null) {
            sb.append(current.value);
            if (current.next != null) {
                sb.append(",");
            }
            current = current.next;
        }
        return sb.toString();
    }
}

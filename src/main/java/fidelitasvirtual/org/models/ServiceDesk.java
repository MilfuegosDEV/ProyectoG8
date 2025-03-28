package fidelitasvirtual.org.models;

class Node {
    private Ticket ticket;
    private Node next;

    public Node(Ticket ticket) {
        this.ticket = ticket;
        this.next = null;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

public class ServiceDesk {
    private Node head;
    private Node tail;

    public ServiceDesk() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void add(Ticket ticket) {
        Node newNode = new Node(ticket);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    public Ticket poll() {
        if (isEmpty()) {
            return null;
        }
        Ticket ticket = head.getTicket();
        head = head.getNext();
        if (head == null) {
            tail = null; // Si la cola queda vacía, tail también debe ser null
        }
        return ticket;
    }

    public Ticket peek() {
        return isEmpty() ? null : head.getTicket();
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "Caja: ...";
        }
        StringBuilder sb = new StringBuilder();
        Node current = head;

        sb.append("Caja: ");
        while (current != null) {
            sb.append(current.getTicket().getClient().getName());
            if (current.getNext() != null) {
                sb.append(" <- ");
            }
            current = current.getNext();
        }
        sb.append(" <- Final de la cola");

        return sb.toString();
    }
}

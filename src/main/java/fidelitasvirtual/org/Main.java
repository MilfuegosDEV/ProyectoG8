package fidelitasvirtual.org;

import fidelitasvirtual.org.models.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Client client1 = new Client(1, "Daniel", 30, "Daniel", 'A');
        Client client2 = new Client(1, "Jose", 30, "Daniel", 'A');
        Client client3 = new Client(1, "Maria", 30, "Daniel", 'A');
        Client client4 = new Client(1, "Jose", 30, "Daniel", 'A');
        Client client5 = new Client(1, "Pablo", 30, "Daniel", 'A');

        System.out.println(client1);


        Ticket ticket1 = new Ticket(client1, "P");
        Ticket ticket2 = new Ticket(client2, "P");
        System.out.println(ticket1);

        ServiceDesk queue = new ServiceDesk();
        queue.add(ticket1);
        queue.add(ticket2);
        System.out.println(queue);

        queue.poll();
        System.out.println(queue);


    }
}
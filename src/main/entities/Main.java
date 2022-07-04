package main.entities;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        // get the arrayList
        ArrayList<Client> lista = new ArrayList<>();

        // declare test clients
        Client client1 = new Client(39487677, "Lucas","Doe");
        Client client2 = new Client(42983772, "Juan","Rio");
        Client client3 = new Client(36845297, "Luciana","Perez");
        Client client4 = new Client(4782399, "Esteban","Marquez");
        Client client5 = new Client(34847723, "Pablo","Rosa");
        Client client6 = new Client(38747288, "Lucas","Doe");

        // populate list
        lista.add(client1);
        lista.add(client2);
        lista.add(client3);
        lista.add(client4);
        lista.add(client5);

        if(client1.equals(client6)) {
            System.out.println("is the same client");

            System.out.println(client1.hashCode());

            System.out.println(client6.hashCode());
        }else {
            System.out.println("not the same client");

            System.out.println(client1.hashCode());

            System.out.println(client6.hashCode());
        }
    }
}
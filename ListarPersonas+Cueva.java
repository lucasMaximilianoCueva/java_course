import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        // get the arrayList
        ArrayList<Persona> lista = new ArrayList<>();

        // declare people
        Persona persona1 = new Persona("Lucas","Doe");
        Persona persona2 = new Persona("Juan","Rio");
        Persona persona3 = new Persona("Luciana","Perez");
        Persona persona4 = new Persona("Esteban","Marquez");
        Persona persona5 = new Persona("Pablo","Rosa");

        // populate list
        lista.add(persona1);
        lista.add(persona2);
        lista.add(persona3);
        lista.add(persona4);
        lista.add(persona5);

        // sort by name
//        Collections.sort(lista, new Comparator<Persona>() {
//            public int compare(Persona obj1, Persona obj2) {
//                return obj1.getName().compareTo(obj2.getName());
//            }
//        });

        // sort by last name
        Collections.sort(lista, new Comparator<Persona>() {
            public int compare(Persona obj1, Persona obj2) {
                return obj1.getLastName().compareTo(obj2.getLastName());
            }
        });

        // reverse sort
//        Collections.reverse(lista);

        // print
        for(Persona temp: lista){
            System.out.println(temp.toString());
        }
    }
}
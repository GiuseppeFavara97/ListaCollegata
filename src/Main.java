import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Fruit frutta1 = new Fruit("mela");
        Fruit frutta2 = new Fruit("banana");
        Fruit frutta3 = new Fruit("fragola");
        Fruit frutta4 = new Fruit("arancio");

        LinkedList<Fruit> lista = new LinkedList<>();
        lista.add(frutta1);
        lista.add(frutta2);
        lista.add(frutta3);
        lista.add(frutta4);

        System.out.println("lista1:" + lista);

        lista.add(0,new Fruit("mandarino"));
        lista.add(5,new Fruit("Nespola"));

        System.out.println("lista2: " + lista);


    }
}
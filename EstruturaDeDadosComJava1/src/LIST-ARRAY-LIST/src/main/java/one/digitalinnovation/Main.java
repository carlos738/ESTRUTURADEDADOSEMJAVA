package one.digitalinnovation;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> listCarros = new ArrayList<>();

        listCarros.add(new Carro("Ferrari"));
        listCarros.add(new Carro("Jaguar"));
        listCarros.add(new Carro("Jeep"));
        listCarros.add(new Carro("WolksWagen"));

        System.out.println(listCarros.contains(new Carro("Ferrari")));
        System.out.println(listCarros.get(2));

        System.out.println(listCarros.indexOf(new Carro("Jaguar")));
        System.out.println(listCarros.remove(2));

        System.out.println(listCarros);
    }
}

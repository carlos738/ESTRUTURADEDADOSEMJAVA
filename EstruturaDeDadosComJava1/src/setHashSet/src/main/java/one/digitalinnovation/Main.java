package one.digitalinnovation;
import  java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
      Set<Carro> hashSetCarros  = new HashSet<>();

      hashSetCarros.add(new Carro("Ferrari"));
      hashSetCarros.add(new Carro("Jeep"));
      hashSetCarros.add(new Carro("Vectra"));
      hashSetCarros.add(new Carro("Lamburgne"));
      hashSetCarros.add(new Carro("Astra"));
      hashSetCarros.add(new Carro("Gol"));

        System.out.println(hashSetCarros);

        Set<Carro> treeSetCarros= new TreeSet<>();
        treeSetCarros.add(new Carro("Ferrari"));
        treeSetCarros.add(new Carro("Jeep"));
        treeSetCarros.add(new Carro("Vectra"));
        treeSetCarros.add(new Carro("Lamburgne"));
        treeSetCarros.add(new Carro("Astra"));
        treeSetCarros.add(new Carro("Corsa"));

        System.out.println(treeSetCarros);
    }

}

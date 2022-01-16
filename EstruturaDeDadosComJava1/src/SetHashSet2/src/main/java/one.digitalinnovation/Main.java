package one.digitalinnovation;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

   public static void main(String[] args) {
       Set<Carro> hashSetCarros = new HashSet<>();

       hashSetCarros.add(new Carro("Astra"));
       hashSetCarros.add(new Carro("Ferrari"));
       hashSetCarros.add(new Carro("jeep"));
       hashSetCarros.add(new Carro("Corsa"));
       hashSetCarros.add(new Carro("Fusca"));
       hashSetCarros.add(new Carro("Lamburgne"));
       System.out.println(hashSetCarros);

       Set<Carro> treeSetCarros= new TreeSet<>();

       treeSetCarros.add(new Carro("Astra"));
       treeSetCarros.add(new Carro("Ferrari"));
       treeSetCarros.add(new Carro("Jeep"));
       treeSetCarros.add(new Carro("Corsa"));
       treeSetCarros.add(new Carro("Fusca"));
       treeSetCarros.add(new Carro("Lamburgne"));

       System.out.println(treeSetCarros);



   }   }
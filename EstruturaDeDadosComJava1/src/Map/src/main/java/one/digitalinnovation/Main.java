package one.digitalinnovation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Main {
    public static void main(String[] args) {
        Map<String,String>aluno = new HashMap<>();
         aluno.put("Nome","Carlos");
         aluno.put("Idade","45");
         aluno.put("Média","9.9");
         aluno.put("Turma","TI");
         aluno.put("TELEFONE","994384384");

        System.out.println(aluno);

        System.out.println(aluno.keySet());


        List<Map<String, String>> listaAlunos = new ArrayList<>();

        listaAlunos.add(aluno);

        Map<String, String> aluno2 = new HashMap<>();


        aluno2.put("Nome","Maria");
        aluno2.put("Idade","15");
        aluno2.put("Média","6.8");
        aluno2.put("Turma","TI");
        aluno2.put("telefone","998855595");

        listaAlunos.add(aluno2);
        System.out.println(aluno2);
        System.out.println(aluno.containsKey("Nome"));



    }
}

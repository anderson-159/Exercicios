package Aulas;

import java.time.LocalDateTime;

public class AulaArraysFuncoes {

    public static void main(String[] args) {
        String[] filmes = new String[]{
                "Piratas do Caribe",
                "Crepúsculo",
                "Harry Potter",
                "O Senhor dos Anéis",
                "Star Wars",
                "O Dia do Terror"};

        String[] livros = new String[]{"Crepúsculo",
                "Harry Potter",
                "Star Wars",
                "Gossip Girl"};

        imprimir(filmes[2]);

        imprimirArray(livros);
        imprimirArray(filmes);

        imprimir(String.valueOf(100));
    }

    static void imprimirArray(String[] array) {
        for(int i=0; i < array.length; i++) {
            imprimir(i + " ==== " + array[i].toUpperCase());
        }
    }

    static void imprimir(String msg) {
        System.out.println(LocalDateTime.now() + " :-) " + msg);
    }

}

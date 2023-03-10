package br.com.ada.first973.primeiroprojeto.aulas;

public class ExemploArrays {

    public static void main(String[] args) {

        double[] valores = new double[]{12.4, 23.1, 5.0};

        String[] frutas = new String[]{"Pera", "Maça", "Abacaxi"};
        frutas[0] = "Abacate";

        int[] numeros = new int[3];
        numeros[0] = 100;
        numeros[2] = 300;
        numeros[1] = 200;

        for (int i=0; i < numeros.length; i++) {
            System.out.println("Valor = " + numeros[i]);
        }


        String[] nomesArray = new String[5];
        nomesArray[3] = "nome 1";
        nomesArray[2] = "nome 3";
        nomesArray[4] = "nome 5";
        nomesArray[3] = "nome 2";
        nomesArray[1] = "nome 4";
        nomesArray[0] = "nome 0";
        // ERRO: nomesArray[5] = "nome 6";


        for (int i=0; i < nomesArray.length; i++) {
            String nome = nomesArray[i];
            if (nome.equals("nome 2")) {
                System.out.println("Posicao do nome 2 = " + i);
            }
        }

        System.out.println("Posicao 2 = " + nomesArray[2]);

        System.out.println("Tamanho do array: " + nomesArray.length);

        for (int i=0; i < nomesArray.length; i++) {
            String nome = nomesArray[i];
            System.out.println(nome);
        }

    }

}

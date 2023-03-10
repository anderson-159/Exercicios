package br.com.ada.first973.primeiroprojeto.aulas;

public class RepeticaoFor {

    public static void main(String[] args) {

        for (int x=0; x <= 10; x++) {

            int numeroTabuada = x;

            System.out.println("+++++ Tabuada do " + numeroTabuada);

            for (int i = 0; i <= 10; i++) {
                int resultado = numeroTabuada * i;
                System.out.println(numeroTabuada + " x " + i + " = " + resultado);
            }

        }



        /*int i = 0;
        while (i <= 10) {
            int resultado = numeroTabuada * i;
            System.out.println(numeroTabuada + " x " + i + " = " + resultado);
            i++;
        }*/

    }

}

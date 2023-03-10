package br.com.ada.first973.primeiroprojeto.aulas;

public class AulaEstruturaRepeticao {

    public static void main(String[] args) {

        //while
        int i = 0;
        boolean executa = false;

        while (executa) {
            System.out.println("while" + i++ );
            //i++; // ==> i = i + 1;
            if (i == 5) {
                executa = false;
            }
        }

        do {
            System.out.println("do while" + i++ );
            if (i == 5) {
                executa = false;
            }
        } while (executa);

    }

}

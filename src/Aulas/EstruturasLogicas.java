package br.com.ada.first973.primeiroprojeto.aulas;

public class EstruturasLogicas {

    public static void main(String[] args) {

        //Se chover OU metro de greve, entao eu nao vou a escola.
        //Se nao eu vou a escola

        boolean estaChovendo = true;
        boolean metroEmGreve = false;

        // E = && (and)
        // OU = || (or)
        if (estaChovendo || metroEmGreve) {
            System.out.println("Nao vou a escola");
        } else {
            System.out.println("Eu vou a escola");
        }


    }

}

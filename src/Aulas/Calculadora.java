package br.com.ada.first973.primeiroprojeto.aulas;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        /*
            soma +
            subtracao -
            divisao /
            multiplicacao *
        */

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite valor 1: ");
        double valor1 = Double.parseDouble(entrada.nextLine());

        System.out.print("Digite valor 2: ");
        double valor2 = Double.parseDouble(entrada.nextLine());

        System.out.print("soma (SO) subtracao (SU) divisao (DI) multiplicacao (MU): ");
        String operacao = entrada.nextLine();

        double resultado = 0;

        if ( operacao.equalsIgnoreCase("SO") ) {
            resultado = valor1 + valor2;
        } else if ( operacao.equalsIgnoreCase("SU") ) {
            resultado = valor1 - valor2;
        } else if ( operacao.equalsIgnoreCase("di") ) {
            resultado = valor1 / valor2;
        } else if ( operacao.equalsIgnoreCase("MU") ) {
            resultado = valor1 * valor2;
        }

        // != diferente

        System.out.printf("Resultado: %f", resultado);
    }

}

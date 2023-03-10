package br.com.ada.first973.primeiroprojeto.aulas;

import java.util.Scanner;

public class TesteNextDouble {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Cotaçao do dolar: ");
        double cotacao = entrada.nextDouble();

        System.out.print("Total em reais: ");
        double totalReais = entrada.nextDouble();

        double valorTotal = totalReais / cotacao;

        System.out.print("Nome: ");
        entrada.nextLine();
        String nome = entrada.nextLine();

        System.out.printf("%s, Total em dolar US$ %.2f ", nome, valorTotal);


    }

}

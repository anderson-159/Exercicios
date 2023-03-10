package Exercicios;

import java.util.Scanner;

public class EntradaDados {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu nome: "); String nome = entrada.nextLine();

        System.out.print("Digite a sua cidade: "); String cidade = entrada.nextLine();

        System.out.print("Digite o seu ano de nascimento: "); int anoNascimento = entrada.nextInt();

        final int ANO_Atual = 2023;

        int idade = ANO_Atual - anoNascimento;

        System.out.println("Ola, " + nome + ". A sua idade é " + idade + ". A sua cidade é " + cidade +".");

    }
}
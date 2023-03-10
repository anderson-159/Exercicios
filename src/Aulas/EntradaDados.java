package br.com.ada.first973.primeiroprojeto.aulas;

import java.util.Scanner;

public class EntradaDados {

    public static void main(String[] args) {

        boolean executar = false;

        do {
            Scanner entrada = new Scanner(System.in);

            System.out.println("Digite o seu nome: ");
            String nome = entrada.nextLine();

            System.out.println("Digite o seu ano de nascimento: ");
            int anoNascimento = Integer.parseInt(entrada.nextLine());

            int idade = 2023 - anoNascimento;

            System.out.println(nome + ", sua idade é " + idade);

            System.out.println("Gostaria de continuar (S/N)?: ");
            String continuar = entrada.nextLine();

            if (continuar.equals("S")) {
                executar = true;
            } else {
                executar = false;
            }
        } while (executar);


    }

}

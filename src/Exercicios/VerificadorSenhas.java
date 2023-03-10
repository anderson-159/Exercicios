package Exercicios;

import java.util.Scanner;
public class VerificadorSenhas {
    public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    int senha = 7777, senhaUsu;
    boolean resp = false;

    do {

        System.out.println("digite a senha");
        senhaUsu = entrada.nextInt();

        if (senha != senhaUsu) {
            System.out.println("Senha incorreta!");
            System.out.println("Deseja tentar novamente ?");
            System.out.println("S/N");
            String resposta = entrada.next();

            if (resposta.equalsIgnoreCase("s")){
                resp = true;
            }else if(resposta.equalsIgnoreCase("n")){
                resp = false;
            }

        }else {
            System.out.println("Senha correta, bem vindo ");
            resp = false;
        }

    } while (resp);
}
}
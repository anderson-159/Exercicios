package Exercicios;

import java.util.Scanner;

public class ExercicioCalculaIdade {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

    imprime("Digite o ano de seu nascimento: ");
    int anoNascimento = entrada.nextInt();

    int anoAtual = 2023;

    int idade = anoAtual - anoNascimento;

    imprimeIdade(idade);

    boolean maiorIdade = verificarMaiorIdade(idade);
    if (maiorIdade)
    {
        imprime("Acesso Liberado!!!");
    }
    else
    {
        imprime("Acesso Negado");
    }
}

    public static void imprimeIdade(int idade)
    {
        imprime("A idade do usuário é: " + idade + " anos.");
    }

    public static boolean verificarMaiorIdade(int idade)
    {

        if (idade >= 18)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void imprime(String msg)
    {
        System.out.println(msg);
    }
}

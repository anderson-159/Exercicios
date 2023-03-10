package Exercicios;

import java.util.Scanner;
public class Conversor {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    double real, dolar, cotacao;

    System.out.print("Digite a quantidade em real: ");
    real = input.nextDouble();

    System.out.print("Digite a cotação do dólar hoje: ");
    cotacao = input.nextDouble();

    dolar = real/cotacao;

    System.out.printf("Valor convertido em dólar: US$ %.2f", dolar);
    }
}

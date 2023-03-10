package Exercicios;

import java.util.Scanner;
public class MaiorPreco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    System.out.println("Verificar o qual é o produto mais caro e o mais barato");
    System.out.print("Informe o nome do produto 1: ");
    String produto1 = input.nextLine();

    System.out.print("Informe o preço do produto 1: ");
    String precoProduto1 = input.nextLine();

    System.out.print("Informe o nome do produto 2: ");
    String produto2 = input.nextLine();

    System.out.print("Informe o preço do produto 2: ");
    String precoProduto2 = input.nextLine();

    double p1 = Double.parseDouble(precoProduto1);
    double p2 = Double.parseDouble(precoProduto2);

    if (p1 > p2) {
        System.out.printf("Nome: %s%n Preço: %.2f", produto1, p1);
    } else {
        System.out.printf("Nome: %s%n Preço: %.2f", produto2, p2);
    }
}
}

package Exercicios;

import java.math.BigDecimal; import java.math.RoundingMode; import java.util.Scanner;

public class Conversao2 {

    public static void main(String[] args) {

        boolean continua = false;

        do {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Cotaçao do dolar: ");
            BigDecimal cotacao = new BigDecimal(entrada.nextLine());

            System.out.print("Total em reais: ");
            BigDecimal totalReais = new BigDecimal(entrada.nextLine());

            BigDecimal valorTotal = totalReais.divide(cotacao, 4, RoundingMode.DOWN);
            System.out.printf("Total em dolar US$ %.2f: ", valorTotal);

            System.out.print("\n Continua? (S/N): ");
            String resposta = entrada.nextLine();
            if (resposta.equalsIgnoreCase("s")) {
                continua = true;
            } else {
                continua = false;
            }

        } while (continua);

    }
}
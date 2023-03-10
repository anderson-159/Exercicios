package br.com.ada.first973.primeiroprojeto.aulas;

import java.util.Arrays;
import java.util.Scanner;

public class EstruturaLogicas2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o mes: ");
        int mes = entrada.nextInt();

        if (mes == 0 || mes > 12) {
            System.out.println("Valor invalido");
            System.exit(-1);
        }

        String mesString = "";

        if (mes == 1) {
            mesString = "janeiro";
        } else if (mes == 2) {
            mesString = "fevereiro";
        } else if (mes == 3) {
            mesString = "março";
        } else if (mes == 4) {
            mesString = "abril";
        } else if (mes == 5) {
            mesString = "maio";
        } else if (mes == 6) {
            mesString = "junho";
        } else if (mes == 7) {
            mesString = "julho";
        } else if (mes == 8) {
            mesString = "agosto";
        } else if (mes == 9) {
            mesString = "setembro";
        } else if (mes == 10) {
            mesString = "outubro";
        } else if (mes == 11) {
            mesString = "novembro";
        } else if (mes == 12) {
            mesString = "dezembro";
        } else {
            mesString = "NAO ENCONTRADO";
        }

        System.out.printf("O mês é %s", mesString);

    }

}

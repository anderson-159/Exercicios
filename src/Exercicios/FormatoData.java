package Exercicios;

import java.util.Scanner;

public class FormatoData {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

    System.out.println("Informe uma data: DD/MM/AAAA");
    String data = entrada.nextLine();

    String[] formatoData = data.split("/");

    String mes = "";

    switch (formatoData[1]) {
        case "01":
            mes = "Janeiro";
            break;
        case "02":
            mes = "Fevereiro";
            break;
        case "03":
            mes = "Março";
            break;
        case "04":
            mes = "Abril";
            break;
        case "05":
            mes = "Maio";
            break;
        case "06":
            mes = "Junho";
            break;
        case "07":
            mes = "Julho";
            break;
        case "08":
            mes = "Agosto";
            break;
        case "09":
            mes = "Setembro";
            break;
        case "10":
            mes = "Outubro";
            break;
        case "11":
            mes = "Novembro";
            break;
        case "12":
            mes = "Dezembro";
            break;

        default:
            throw new IllegalStateException("Unexpected value: " + formatoData[1]);
    }
    System.out.print("Dia " + formatoData[0] + " de " + mes + " de " + formatoData[2]);
}
}

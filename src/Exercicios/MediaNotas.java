package Exercicios;

import java.util.Scanner;

public class MediaNotas {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Quantos alunos possuem na turma");

        int numAlunos = Integer.parseInt(leitura.nextLine());
        int nota1, nota2, nota3;
        int media;

        for (int i = 0; i < numAlunos; i++) {

            System.out.println("Aluno " + i + ", digite sua 1ª nota");
            nota1 = leitura.nextInt();

            System.out.println("Aluno " + i + ", digite sua 2ª nota");
            nota2 = leitura.nextInt();

            System.out.println("Aluno " + i + ", digite sua 3ª nota");
            nota3 = leitura.nextInt();

            media = (nota1 + nota2 + nota3) / numAlunos;
            System.out.println("A média do aluno " + i + " é " + media);
        }
    }
}

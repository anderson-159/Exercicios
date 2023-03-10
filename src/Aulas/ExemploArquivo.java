package br.com.ada.first973.primeiroprojeto.aulas;

import java.io.*;

public class ExemploArquivo {

    public static void main(String[] args) {

        BufferedInputStream arquivo = null;

        try {

            arquivo = new BufferedInputStream(new FileInputStream("c:/users/doc/arquivo.txt"));

        } catch (Exception e) {
            System.out.println("Erro ao abrir arquivo: " + e.getMessage());
        } finally {
            try {
                arquivo.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

}

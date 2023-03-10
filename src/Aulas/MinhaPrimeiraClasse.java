package br.com.ada.first973.primeiroprojeto.aulas;

public class MinhaPrimeiraClasse {

    public static void main(String[] args) {

        //numeros inteiros
        int idade = 38;
        long ano = 2023;

        //numeros ponto flutuante
        float porcentagem = 20.5f;
        double valor = 500.23;

        //boolean
        boolean verdadeiroFalso = false;

        var variavelVar = 1;
        //variavelVar = "1";


        int anoNascimento = 1984;
        int anoAtual = 2023;
        //+ - / *
        //% resto
        int qtdeAnos = anoAtual - anoNascimento;

        //numeros ou textos
        String mensagemDeBoasVindas = "Ola, Mundo! Bem vindo ";

        String nomePessoa = "Rodrigo";

        String idadeMsg = " Idade: ";

        mensagemDeBoasVindas = mensagemDeBoasVindas + nomePessoa + idadeMsg + qtdeAnos;

        System.out.println(mensagemDeBoasVindas);

        String novaString = "Valor: " + 30 + 1;
        System.out.println(novaString);

    }

}





package br.com.ada.first973.primeiroprojeto.aulas;

public class AulaFuncoes {

    static int valor1 = 10;

    public static void main(String[] args) {

        int valor2 = 20;

        int resultadoSoma = somar(valor1, valor2);
        int resultadoSubtracao = subtrair(valor1, valor2);
        int resuladoMultiplicacao = multiplicar(valor1, valor2);

        System.out.println(valor1); //10
        System.out.println(valor2); //20
        System.out.println(resultadoSoma); //30
        System.out.println(resultadoSubtracao);

        int tabuada = 3;
        for (int i=0; i<=10; i++) {
            int resultadoTabuada = multiplicar(i, tabuada);
            String mensagem = tabuada + " x " + i + " = " + resultadoTabuada;
            imprimir(mensagem);
        }

    }

    static void imprimir(String mensagem) {
        System.out.println(mensagem);
    }

    static int somar(int a, int b) {
        int resultado = a + b;
        return resultado;
    }

    static int subtrair(int valor1, int valor2) {
        int resultado = valor1 - valor2;
        return resultado;
    }

    static int multiplicar(int valor1, int valor2) {
        int resultado = valor1 * valor2;
        return resultado;
    }

}

package Interface_operacaoMatematica;

public class MainCalculadora {

    public static void main(String[] args) {
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();

        System.out.println(" -- Calculadora -- ");
        System.out.println("Soma: " + soma.calcular(20, 5));
        System.out.println("Subtração: " + subtracao.calcular(10, 5));
        System.out.println("Multiplicação: " + multiplicacao.calcular(30, 5));
        System.out.println("Divisão: " + divisao.calcular(10, 2));
    }
}

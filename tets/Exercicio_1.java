
import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        //String produto = "Mamao";
        System.out.println("Digite o valor da Compra: ");
        double valor = read.nextDouble();


        int prestacao = 5;
        
        double resultado = valor / prestacao;
        
        //System.out.println("Produto: " + produto);
        System.out.println("Valor das pretacoes: " + resultado);
    }
}

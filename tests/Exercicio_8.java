
import java.util.Scanner;

public class Exercicio_8 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double[] notas = new double[2];

        String nome;
        int i;

        System.out.println("Digite o seu nome: ");
        nome = read.next();

        do { 
            for(i = 0; i < 2; i++) {
                System.out.println("Digite a " + (i + 1) + "º nota: ");
                notas[i] = read.nextDouble();
            }

            if(notas[0] < 0 || notas[0] > 10){
                System.out.println("Nota invalida! \nDigite a nota novamente:");
            }

        } while (notas[0] < 0 || notas[0] > 10);

        System.out.println("Solicitando notas");
        System.out.println("Nome do aluno: " + nome);

        for (double nota : notas) {
            System.out.println("Nota do aluno: " + nota);
        }

    read.close();
    }
}

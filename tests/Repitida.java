
import java.util.Scanner;

public class Repitida {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int i;
        double nota = 0;

        System.out.println("Digite o seu nome: ");
        String nome = read.next();

        do { 
            for(i = 1; i < 2; i++){
                System.out.println("Digite sua nota: ");
                nota = read.nextDouble();
            }

        } while (nota < 0 || nota > 10);

        
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Nota do aluno: " + nota);

    }
}

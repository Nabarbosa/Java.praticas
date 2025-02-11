
import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int idade;

        System.out.println("Digite a sua idade: ");
        idade = read.nextInt();
        
        while (idade < 18) { 
            System.out.println("Acesso negado!");
            System.out.println("Digite sua idade: ");
            idade = read.nextInt();
        }

        System.out.println("Acesso permitido.");
        System.out.println("Carregando...");
    }
    
}

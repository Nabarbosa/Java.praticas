
import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do{
            System.out.println("Digite um numero: ");

            numero = scanner.nextInt();

        } while (numero < 0 || numero > 10);

        System.out.println("Numero valido inserido: " + numero);
        scanner.close();

        while (numero < 0 || numero > 10) {
            System.out.println("Digite um numero: ");
            System.out.println("Tente novamente: ");
        }

        System.out.println("Numero valido inserido: ");
    }

}

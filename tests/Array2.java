
import java.util.Scanner;
public class Array2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double[] notas = new double[2];

        for(int i = 0; i < 2; i++) {
            System.out.println("Digite a " + (i + 1) + "° nota: ");
            notas[i] = read.nextDouble();
        }

        System.out.println("\n Exibindo as notas");

        for (double nota : notas) {
            System.out.println("Nota: " + nota);
        }

        read.close();
    }
}

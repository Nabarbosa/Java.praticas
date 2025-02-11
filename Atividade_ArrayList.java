
import java.util.ArrayList;
import java.util.Scanner;

public class Atividade_ArrayList {
    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<>();
        Scanner ler = new Scanner(System.in);
        String resposta;

        do {
            System.out.println("Digite uma nota: ");
            notas.add(ler.nextDouble());

            System.out.println("Deseja inserir mais uma nota? ");
            System.out.println("\nPressione a tecla N para sair");
            resposta = ler.next();
        } while (!resposta.equalsIgnoreCase("n"));

        System.out.println("Exibindo as notas: ");
        for(double nota: notas) {
            System.out.println("Nota: " + nota);
        }
        
        /* 
        notas.add(10.0);
        notas.add(8.0);

        for(double nota: notas) {
            System.out.println("Notas: " + notas);
        }*/
    }
}

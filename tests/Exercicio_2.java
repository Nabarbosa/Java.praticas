
import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);


        String nome, resultado;
        double primeiraNota, segundaNota, media;
    
        System.out.println("Nome do aluno: ");
        nome = read.next();
    
        System.out.println("Primeira nota do aluno: ");
        primeiraNota = read.nextDouble();
    
        System.out.println("Segunda nota do aluno");
        segundaNota = read.nextDouble();
            
        media = (primeiraNota + segundaNota) / 2;
        
        if (media >= 7){
            resultado = "Aprovado";
        } else if (media >= 5){
            resultado = "Verificacao Suplementar";
        } else {
            resultado = "Reprovado";
        }
        
        System.out.println("Nome do Aluno: " + nome);
        System.out.println("Media do aluno: " + media);
        System.out.println("Resultado: " + resultado);
    }
}

   
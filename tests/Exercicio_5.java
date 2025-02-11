import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String nome, resultado;
        double primeiraNota, segundaNota, media;
    
        System.out.println("Nome do aluno: ");
        nome = read.next();
        
        do{
            System.out.println("Digite a primeira nota: ");
            primeiraNota = read.nextDouble();
            
            if(primeiraNota < 0 || primeiraNota > 10){
                System.out.println("Nota informada invalida! Tente novamente: ");
            }
            
        } while (primeiraNota < 0 || primeiraNota > 10 );
        
        do{
            System.out.println("Digite a segunda nota: ");
            segundaNota = read.nextDouble();
            
            if(segundaNota < 0 || segundaNota > 10){
                System.out.println("Nota informada invalida! Tente novamente: ");
            }
        } while (segundaNota < 0 || segundaNota > 10);
        
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

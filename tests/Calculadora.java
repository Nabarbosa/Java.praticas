public class Calculadora {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int maior;
        int menor;

        if(a > b){
            maior = a;
        } else {
            maior = b;
        }

        if(a < b){
            menor = a;
        } else {
            menor = b;
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);

    }
}

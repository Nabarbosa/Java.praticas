package atividade_02;

public class MainProduto {
    public static void main(String[] args) {
        Processador processador01 = new Processador("4.9GHZ", "Intel", "i7");

        System.out.println(processador01.toString());
        
        Memoria memoria01 = new Memoria("Multilaser", "DDR3", "32GB");
        System.out.println(memoria01.toString());
    }
}

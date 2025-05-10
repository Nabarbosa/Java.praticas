package atividade_03;

public class MainProduto {
    public static void main(String[] args) {
        
        Camisa camisa01 = new Camisa("Azul", "Nike", "R$ 200,00", "p");
        System.out.println(camisa01.toString());
        
        Calca calca01 = new Calca("Branca", "Marisa", "R$ 365,00", "38");
        System.out.println(calca01.toString());

        Sapato sapato01 = new Sapato("Preto", "All Star", "R$ 99,90", "38");
        System.out.println(sapato01.toString());
    }
}

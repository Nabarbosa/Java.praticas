package atividade_02;

public class MainProduto {
    public static void main(String[] args) {

        Processador processador01 = new Processador("4.9GHZ", "Intel", "i7");
        System.out.println(processador01.toString());
        
        Memoria memoria01 = new Memoria("Multilaser", "DDR3", "32GB");
        System.out.println(memoria01.toString());

        PlacaMae placaMae01 = new PlacaMae("Intel Core", "i5", "LGA1150");
        System.out.println(placaMae01.toString());

        DispositivoDeArmazenamento dispoArmazenamento01 = new DispositivoDeArmazenamento("500 GB", "HD SSD", "Kingston", "SATA");
        System.out.println(dispoArmazenamento01.toString());
    }
}

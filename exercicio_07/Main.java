package exercicio_07;

public class Main {

    public static void main(String[] args) {
        Medico medico = new Medico("João", "joao@gmail.com", "5000", new Endereco("Rua A", "123", "Apto 1", "12345-678", "São Paulo"), "123456");
        Engenheiro engenheiro = new Engenheiro("Maria", "maria@gmail.com", "6000", new Endereco("Rua B", "456", "Apto 2", "23456-789", "Rio de Janeiro"), "654321");

        System.out.println(medico.toString());
        System.out.println(engenheiro.toString());

    }        
}


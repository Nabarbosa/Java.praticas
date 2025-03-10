  package encapsulamento.src.main;

public class MainCliente {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("ana1@gmail.com", "Ana Banana", 456);
        System.out.println("1º Cliente --");
        System.out.println(cliente.toString());
        
        Cliente cliente2 = new Cliente();
        cliente2.setNome("João Batista");
        cliente2.setEmail("joaoba@gmail.com");
        cliente2.setSenha(321);

        System.out.println("\n2º Cliente -- ");
        System.out.println("Nome do 2º cliente: " + cliente2.getNome()); 
        System.out.println("Email do 2º cliente: " + cliente2.getEmail());
        System.out.println("Senha do 2º cliente: " + cliente2.getSenha());
    }

}

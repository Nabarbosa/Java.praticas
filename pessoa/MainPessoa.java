package pessoa;

public class MainPessoa {
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente("Marta", 45, "20/03/2025", "Cartão");
        Funcionario funconario1 = new Funcionario("Alice", 20, "001", "Administradora", 50000.00);
        
        System.out.println(cliente1.toString());        
        System.out.println(funconario1.toString());        
    }
}

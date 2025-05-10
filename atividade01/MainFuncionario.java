package atividade01;

public class MainFuncionario {
    public static void main(String[] args) {
        
        Funcionario funcionario1 = new Funcionario("324", "MArta", "3.500", Setor.RECURSOS_HUMANOS, Sexo.FEMININO, 25);
        
        System.out.println(funcionario1.toString());
    }
}

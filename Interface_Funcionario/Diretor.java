package Interface_Funcionario;

public class Diretor extends Funcionario implements Contratacao {

    private final double PREMIO = 0.20;

    public Diretor(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase, double salarioFinal) {
        super(nome, dataNascimento, sexo, setor, salarioBase, salarioFinal);
    }

    @Override
    public double getSalarioFinal() {
        return salarioBase + salarioBase * PREMIO;
    }

    @Override
    public void adimitir(Funcionario funcionario) {
        System.out.println("Contratando funcionário: " + funcionario.getNome());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitindo funcionário: " + funcionario.getNome());
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Salario Final: " + getSalarioFinal();
    }
    
}

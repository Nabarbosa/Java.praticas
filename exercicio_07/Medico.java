package exercicio_07;

public class Medico extends Funcionario {

    private String crm;

    public Medico(String nome, String email, String salario, Endereco endereco, String crm) {
        super(nome, email, salario, endereco);
        this.crm = crm;
    }

    // Getters e Setters
    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public String toString() {
        return "Médico [" +
               super.toString() + 
               ", CRM=" + crm + 
               "]";
    }
}

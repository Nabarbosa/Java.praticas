package exercicio_07;

public abstract class Funcionario {

    protected String nome;
    protected String email;
    protected String salario;
    protected Endereco endereco;

    public Funcionario(String nome, String email, String salario, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.salario = salario;
        this.endereco = endereco;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Funcionario [" +
               "nome=" + nome + 
               ", email=" + email + 
               ", salario=" + salario + 
               ", endereco=" + endereco.toString() + 
               "]";
    }
}

package heranca_02;

public class Fisica extends Pessoa {

    private String cpf;
    private String rg;
    private String dataNascimento;

    public Fisica(String nome, String telefone, String cpf, String rg, String dataNascimento) {
        super(nome, telefone);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }

    // Getters e Setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Pessoa Física [" +
               super.toString() + 
               ", CPF=" + cpf + 
               ", RG=" + rg + 
               ", Data de Nascimento=" + dataNascimento + 
               "]";
    }
}

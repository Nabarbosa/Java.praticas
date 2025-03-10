package heranca_02;

public class Juridica extends Pessoa{

    private String cnpj;
    private String inscricaoEstadual;
    
    public Juridica(String nome, String telefone, String cnpj, String inscricaoEstadual) {
        super(nome, telefone);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    // Getters e Setters
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    @Override
    public String toString() {
        return "Pessoa Jurídica [" +
               super.toString() + 
               ", CNPJ=" + cnpj + 
               ", Inscrição Estadual=" + inscricaoEstadual + 
               "]";
    } 
}

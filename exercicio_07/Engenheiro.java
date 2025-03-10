package exercicio_07;

public class Engenheiro extends Funcionario {

    private String crea;

    public Engenheiro(String nome, String email, String salario, Endereco endereco, String crea) {
        super(nome, email, salario, endereco);
        this.crea = crea;
    }

    // Getters e Setters
    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    @Override
    public String toString() {
        return "Engenheiro [" +
               super.toString() + 
               ", CREA=" + crea +
               "]";
    }
}

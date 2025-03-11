package Interface_Funcionario;

public class Motoboy extends Funcionario{

    private String carteiraDeHabilitacao;

    public Motoboy(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase, double salarioFinal, String carteiraDeHabilitacao) {
        super(nome, dataNascimento, sexo, setor, salarioBase, salarioFinal);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    @Override
    public double getSalarioFinal() {
        return salarioBase;
    }

    @Override
    public String toString(){
        return "nome = " + nome + "\n" +
        "dataNascimento = " + dataNascimento + "\n" +
        "sexo = " + sexo + "\n" +
        "setor = " + setor + "\n" +
        "salarioBase = " + salarioBase + "\n" +
        "salarioFinal = " + salarioFinal + "\n" +
        "carteiraDeHabilitacao = " + carteiraDeHabilitacao;
    }

}

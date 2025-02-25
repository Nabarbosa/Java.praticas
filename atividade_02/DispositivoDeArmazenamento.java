package atividade_02;

public class DispositivoDeArmazenamento extends Produto{
    private String capacidadeArmazenamento;
    private String tipoDeConexao;

    public DispositivoDeArmazenamento(String capacidadeArmazenamento, String tipoDeConexao, String marca, String modelo) {
        super(marca, modelo);
        this.capacidadeArmazenamento = capacidadeArmazenamento;
        this.tipoDeConexao = tipoDeConexao;
    }

    public String getCapacidadeArmazenamento() {
        return capacidadeArmazenamento;
    }

    public void setCapacidadeArmazenamento(String capacidadeArmazenamento) {
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    public String getTipoDeConexao() {
        return tipoDeConexao;
    }

    public void setTipoDeConexao(String tipoDeConexao) {
        this.tipoDeConexao = tipoDeConexao;
    }

    @Override
    public String toString() {
        return "DispositivoDeArmazenamento [marca=" + marca + ", modelo=" + modelo + ", capacidadeArmazenamento="
                + capacidadeArmazenamento + ", tipoDeConexao=" + tipoDeConexao + "]";
    }


}
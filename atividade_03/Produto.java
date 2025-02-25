package atividade_03;

public class Produto {
    protected String marca;
    protected String cor;
    protected String tamanho;
    protected String preco;

    public Produto(String cor, String marca, String preco, String tamanho) {
        this.cor = cor;
        this.marca = marca;
        this.preco = preco;
        this.tamanho = tamanho;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto [marca=" + marca + ", cor=" + cor + ", tamanho=" + tamanho + ", preco=" + preco + "]";
    }


}

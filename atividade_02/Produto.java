package atividade_02;

public class Produto {
    protected String marca;
    protected String modelo;
    
    public Produto() {
    }

    public Produto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Produto [marca=" + marca + ", modelo=" + modelo + "]";
    }


}

package encapsulamento.src.main;

public class Cliente {
    private String nome;
    private String email;
    private int senha;

    public Cliente(String email, String nome, int senha) {
        this.email = email;
        this.nome = nome;
        this.senha = senha;
    }

    public Cliente() {
    }

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

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Nome do 1º Cliente: " + nome + "\nEmail do 1º Cliente: " + email + "\nSenha do 1º Cliente:" + senha;
    }

}

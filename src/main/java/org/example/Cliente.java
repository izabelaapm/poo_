package org.example;

public class Cliente {
    private int cod;
    private String nome;

    public Cliente(int cod, String nome) {
        this.cod = cod;
        this.nome = nome;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cod=" + cod +
                ", nome='" + nome + '\'' +
                '}';
    }
}

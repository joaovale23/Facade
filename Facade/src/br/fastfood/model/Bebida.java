package br.fastfood.model;

public class Bebida implements ItemCombo {
    private final String nome;
    private final double preco;

    public Bebida(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void bigCaipirinha(){
        Bebida bigCaipirinha = new Bebida("bigCaipirinha", 20);
    }

    public void bigMojito(){
        Bebida bigMojito = new Bebida("bigMojito", 24);
    }

    public void bigNegroni(){
        Bebida bigNegroni = new Bebida("bigNegroni", 30);
    }

    public String getNome()  { return nome; }
    public double getPreco() { return preco; }
    @Override public String toString() { return nome + " R$" + preco; }
}

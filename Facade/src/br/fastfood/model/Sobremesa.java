package br.fastfood.model;

public class Sobremesa implements ItemCombo {
    private final String nome;
    private final double preco;

    public Sobremesa(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void bigBanoffe(){
        Sobremesa bigBanoffe = new Sobremesa("bigBanoffe", 20);
    }

    public void bigGelatto(){
        Sobremesa bigGelatto = new Sobremesa("bigGelatto", 20);
    }

    public void bigBrulee(){
        Sobremesa bigBrulee = new Sobremesa("bigBrulée", 20);
    }

    public String getNome()  { return nome; }
    public double getPreco() { return preco; }
    @Override public String toString() { return nome + " R$" + preco; }
}

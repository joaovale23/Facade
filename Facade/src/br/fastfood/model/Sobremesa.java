package br.fastfood.model;

public class Sobremesa implements ItemCombo {
    private final String nome;
    private final double preco;

    public Sobremesa(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Factory Methods
    public static Sobremesa bigBanoffe() {
        return new Sobremesa("Big Banoffe", 20.0);
    }

    public static Sobremesa bigGelatto() {
        return new Sobremesa("Big Gelatto", 20.0);
    }

    public static Sobremesa bigBrulee() {
        return new Sobremesa("Big Brulée", 20.0);
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return nome + " - R$ " + preco;
    }
}
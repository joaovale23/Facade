package br.fastfood.model;

public class Burger implements ItemCombo {
    private final String nome;
    private final double preco;

    public Burger(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Factory Methods
    public static Burger bigCheddar() {
        return new Burger("Big Cheddar", 45.0);
    }

    public static Burger bigOnion() {
        return new Burger("Big Onion", 40.0);
    }

    public static Burger bigBacon() {
        return new Burger("Big Bacon", 50.0);
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
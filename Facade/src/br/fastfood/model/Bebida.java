package br.fastfood.model;

public class Bebida implements ItemCombo {
    private final String nome;
    private final double preco;

    public Bebida(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Factory Methods
    public static Bebida bigCaipirinha() {
        return new Bebida("Big Caipirinha", 20.0);
    }

    public static Bebida bigMojito() {
        return new Bebida("Big Mojito", 24.0);
    }

    public static Bebida bigNegroni() {
        return new Bebida("Big Negroni", 30.0);
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

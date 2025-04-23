package br.fastfood.model;

public class Burguer implements ItemCombo {
    private final String nome;
    private final double preco;

    public Burguer(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void bigCheddar(){
        Burguer bigCheddar = new Burguer("bigCheddar", 45);
    }

    public void bigOnion(){
        Burguer bigOnion = new Burguer("bigOnion", 40);
    }

    public void bigBacon(){
        Burguer bigBacon = new Burguer("bigBacon", 50);
    }

    public String getNome()  { return nome; }
    public double getPreco() { return preco; }
    @Override public String toString() { return nome + " R$" + preco; }
}

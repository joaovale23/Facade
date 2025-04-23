package br.fastfood.facade;

import br.fastfood.model.Bebida;
import br.fastfood.model.Burger;
import br.fastfood.model.Combo;
import br.fastfood.model.Sobremesa;

public class ComboFacade {

    private Combo combo;

    public void criarCombo(int codigo) {
        switch (codigo) {
            case 1: // Combo Master
                combo = new Combo(Burger.bigCheddar(), Bebida.bigCaipirinha(), Sobremesa.bigBanoffe());
                break;
            case 2: // Super Combo
                combo = new Combo(Burger.bigBacon(), Bebida.bigNegroni(), Sobremesa.bigGelatto());
                break;
            case 3: // Super Combo
                combo = new Combo(Burger.bigOnion(), Bebida.bigMojito(), Sobremesa.bigBrulee());
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }

    public void exibirItens() {
        if (combo != null) {
            combo.exibirItens();
        } else {
            System.out.println("Nenhum combo foi criado.");
        }
    }

    public double getPrecoTotal() {
        if (combo != null) {
            return combo.getPrecoTotal();
        }
        return 0;
    }
}
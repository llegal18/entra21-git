package classes.guardados;

import classes.itens.Item;

import java.util.ArrayList;
import java.util.Locale;

public class Estante {

    private int capMaxima;
    private ArrayList<Item> itens = new ArrayList<>();

    public Estante(int capMaxima) {
        setCapMaxima(capMaxima);
        setItens(new Item[capMaxima]);
    }

    public boolean estanteCheia() {
        return this.quantidadeItens() == this.getCapMaxima();
    }

    public int quantidadeItens() {
        return this.itens.size();
    }

    public Item buscarItem(String titulo) {
        for (Item i : this.getItens()) {
            if (i.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                return i;
            }
        }
        return null;

        return this.itens.stream().filter(item -> )
    }

    public boolean adicionarItem(Item item) {
        for (int i = 0; i < getItens().length; i++) {
            if (this.getItens()[i] == null) {
                this.getItens()[i] = item;
                return true;
            }
        }
        return false;
    }

    public Item removerItem(int posicao) {
        Item i = this.getItens()[posicao];
        this.getItens()[posicao] = null;
        return i;
    }

    // GETTERS & SETTERS:

    public int getCapMaxima() {
        return capMaxima;
    }

    public void setCapMaxima(int capMaxima) {
        this.capMaxima = capMaxima;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }
}

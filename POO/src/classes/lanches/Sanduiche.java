package classes.lanches;

import java.util.ArrayList;

public abstract class Sanduiche extends Lanche {

    private ArrayList<String> adicionais = new ArrayList<>();

    public void adicionarAdicionais(String adicional) {
        this.adicionais.add(adicional);
    }


    public Sanduiche() {
        this.adicionarIngrediente("Pão");
    }

    public ArrayList<String> getAdicionais() {
        return adicionais;
    }
}






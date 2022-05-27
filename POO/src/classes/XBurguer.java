package classes;

public class XBurguer extends Sanduiche {

    public boolean aberto;

    public XBurguer() {
        this.adicionarIngrediente("Hamburguer");
        this.adicionarIngrediente("Queijunto");
        this.adicionarIngrediente("Preijo");
        this.tipo = "XBurguer";
    }

    @Override
    public void montarComanda() {
        super.montarComanda();
        if (this.aberto) {
            System.out.println("--LANCHE ABERTO--");
        }
    }
}


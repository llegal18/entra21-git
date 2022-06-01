package classes.lanches;

public abstract class Sanduiche extends Lanche {

    private String[] adicionais = new String[10];

    public void adicionarAdicionais(String adicional) {
        for (int i = 0; i < 10; i++) {
            if (this.adicionais[i] == null) {
                this.adicionais[i] = adicional;
                break;
            }
        }
    }

    public Sanduiche() {
        this.adicionarIngrediente("Pão");
    }

    @Override
    public void montarComanda() {
        super.montarComanda();
        if (this.adicionais[0] != null) {
            System.out.println("--ADICIONAIS--");
            for (int i = 0; i < 10; i++) {
                if (adicionais[i] == null) {
                    break;
                }
                System.out.println(adicionais[i]);
            }
        }
        System.out.println("--------------");
    }
}





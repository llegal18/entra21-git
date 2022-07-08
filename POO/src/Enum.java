public enum Enum {

    X_SALADA, X_BURGUER, MISTO_QUENTE, HOT_DOG, MINI_PIZZA, PIIZA;

    private int valorOpcao;

    private String descricao;

    Enum (int valorOpcao, String descricao) {
        valorOpcao = valorOpcao;
        this.descricao = descricao;
    }

    public static

    //GETTERS & SETTERS:
    public int getValorOpcao() {
        return valorOpcao;
    }

    public void setValorOpcao(int valorOpcao) {
        this.valorOpcao = valorOpcao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

package classes.menu;

public enum EMenuItem implements IMenu {
    VOLTAR(0, "Voltar"),

    AVALIAR_ITEM(2, "Avaliar"),

    VER_AVALIACOES(1, "Ver avaliações"),

    MOSTRAR_DETALHES(3, "Mostrar detalhes");

    private int valorOpcao;
    private String descricao;

    EMenuItem(int valorOpcao, String descricao) {
        valorOpcao = valorOpcao;
        this.descricao = descricao;
    }

    public static EMenuItem getByValorOpcao(int escolha) {
        for (EMenuItem e : EMenuItem.values()) {
            if (e.getValorOpcao() == escolha) {
                return e;
            }
        }
        return null;
    }

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

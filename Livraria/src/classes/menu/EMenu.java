package classes.menu;

public enum EMenu implements IMenu {

    SAIR(0, "Sair"),

    ADICIONAR_ITEM(1, "Adicionar item a estante"),

    BUSCAR_ITEM(2, "Buscar item"),

    REMOVER_ITEM(3, "Remover item da estante"),

    MOSTRAR_ITENS(4, "Mostrar itens da estante");

    private int valorOpcao;

    private String descricao;

    EMenu (int valorOpcao, String descricao) {
        valorOpcao = valorOpcao;
        this.descricao = descricao;
    }

    public static EMenu getByValorOpcao(int escolha) {
        for (EMenu e : EMenu.values()) {
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

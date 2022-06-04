package classes.tarefa;
import classes.checklist.ChecklistItem;

import java.util.UUID;

public class Tarefa {

    private ChecklistItem[] checklist;
    private String uuid;
    private String nome;
    private String descricao;
    private boolean completa;
    private int ordem;

    public Tarefa() {
        this.setUUID(UUID.randomUUID().toString());
    }

    public void completar() {
        setCompleta(true);
    }
    // GETTERS & SETTERS:

    public void setUUID(String uuid) {
        this.uuid = uuid;
    }

    public String getUUID() {
        return this.uuid;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setCompleta(boolean completa) {
        this.completa = completa;
    }

    public boolean isCompleta() {
        return this.completa;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    public int getOrdem() {
        return this.ordem;
    }
}
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
        this.setCompleta(true);
        for (ChecklistItem item : this.getChecklist()) {
            if (item != null) {
                item.completar();
            }
        }
    }

    public boolean temChecklist() {
        return this.getChecklist() != null;
    }

    public void criarChecklist(int tamanho) {
        this.setChecklist(new ChecklistItem[tamanho]);
    }

    public boolean adicionarChecklistItem(ChecklistItem item) {
        for (int i = 0; i < this.getChecklist().length; i++) {
            if (this.getChecklist()[i] == null) {
                this.getChecklist()[i] = item;
                return true;
            }
        }
        return false;
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

    public ChecklistItem[] getChecklist() {
        return checklist;
    }

    public void setChecklist(ChecklistItem[] checklist) {
        this.checklist = checklist;
    }
}
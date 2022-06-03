package classes.cliente;

import classes.pedido.Pedido;

import java.security.PublicKey;

public class Cliente {

    private String nome;
    private Pedido pedido;

    public Cliente() {
        this.setPedido(new Pedido());
    }

    // GETTERS & SETTERS:

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
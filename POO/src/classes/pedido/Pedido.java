package classes.pedido;

import classes.lanches.*;

import java.nio.channels.Pipe;
import java.util.ArrayList;

public class Pedido {

    private ArrayList<Lanche> lanches = new ArrayList<>();

    public void imprimirComanda() {
        for (Lanche l : this.getLanches()) {
            if (l != null) {
                if (l instanceof MiniPizza) {
                    MiniPizza mp = ((MiniPizza) l);
                    System.out.println("==== " + mp.getTipo() + " - " + mp.getSabor() + " ====");
                    if (mp.isBordaRecheada()) {
                        System.out.println("--COM BORDA RECHEADA: " + mp.getSaborBorda().toUpperCase() + "--");
                    }
                    if (l instanceof Pizza) {
                        System.out.println("--TAMANHO: " + ((Pizza) l).getTamanho());
                    }
                } else {
                    System.out.println("==== " + l.getTipo() + " ====");
                }
                if (l instanceof XBurguer) {
                    if (((XBurguer) l).isAberto()) {
                        System.out.println("--LANCHE ABERTO--");
                    }
                }
                System.out.printf("Valor: R$%.2f\n", l.getValor());
                System.out.println("--------------");
                System.out.println("-INGREDIENTES-");
                for (String ingrediente : l.getIngredientes()) {
                    if (ingrediente != null) {
                        System.out.println(ingrediente);
                    }
                }
                if (l instanceof Sanduiche) {
                    Sanduiche s = (Sanduiche) l;
                    if (s.getAdicionais()[0] != null) {
                        System.out.println("--ADICIONAIS--");
                        for (String adicional : s.getAdicionais()) {
                            if (adicional != null) {
                                System.out.println(adicional.toUpperCase());
                            }
                        }
                    }
                }
            }
        }
        System.out.println("--------------");
        System.out.printf("Valor total do pedido: R$%.2f\n", this.calcularValorTotal());
        System.out.println("---------------------------------");
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        for (Lanche l : this.getLanches()) {
                valorTotal += l.getValor();
            }
        return valorTotal;
    }

    public void adicionarLanche(Lanche lanche) {
        this.lanches.add(lanche);
    }

    public ArrayList<Lanche> getLanches() {
        return this.lanches;
    }
}


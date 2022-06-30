package Carta;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Carta> cartas = new ArrayList<>();
        for (Naipe n : Naipe.values()) {
            int valorCarta = 1;
            for (ValorCarta vc : ValorCarta.values()) {
                Carta c = new Carta();
                c.setValor(vc);
                c.setNaipe(n);
                c.setValorReal(valorCarta);
                cartas.add(c);
                valorCarta++;
            }
        }
        for (Carta c : cartas) {
            System.out.println(c.getNaipe().getNaipe() + " " + c.getValor().getValor() + " " + c.getNaipe().getNaipe());
        }
    }
}

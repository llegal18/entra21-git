package Classes;

import Classes.AssentoOnibus;
import Classes.MeioTransporte;

import java.util.ArrayList;

public class Onibus implements MeioTransporte {

    private ArrayList<AssentoOnibus> assentos = new ArrayList<>();

    private boolean leito;

    public ArrayList<AssentoOnibus> getAssentos() {
        return assentos;
    }

    public Onibus(int linhasCadeiras) {
        for (int i = 1; i <= linhasCadeiras; i++) {
            AssentoOnibus a = new AssentoOnibus();
            a.setLugar(String.valueOf(i));
            assentos.add(a);
        }
    }

    public void setAssentos(ArrayList<AssentoOnibus> assentos) {
        this.assentos = assentos;
    }

    @Override
    public boolean verificaOcupacao(String assento) {
        for (AssentoOnibus a : assentos) {
            if (a.getLugar().equalsIgnoreCase(assento)) {
                return a.isOcupado();
            }
        }
        return false;
    }

    @Override
    public int quantidadeLivre() {
        int assentosLivres = 0;
        for (AssentoOnibus a : this.assentos) {
            if (!a.isOcupado()) {
                assentosLivres++;
            }
        }
        return assentosLivres;
    }

    @Override
    public void mostrarAssentos() {
        for (int i = 1; i < this.assentos.size(); i++) {
            AssentoOnibus a = assentos.get(i - 1);
            if (a.isOcupado()) {
                System.out.println("[XX]");
            } else if (i < 10) {
                System.out.printf("[%s0]", a.getLugar());
            } else {
                System.out.printf("[%s]", a.getLugar());
            }
            if (i > 0 && i % 2 == 0 && !(i % 4 == 0)) {
                System.out.print(" || ");
            }
            if (i > 0 && i % 4 == 0) {
                System.out.println("");
            }
        }
    }

    @Override
    public Assento getAssento(String assento) {
        for (AssentoOnibus a : this.assentos) {
            if (a.getLugar().equalsIgnoreCase(assento)) {
                return a;
            }
        }
        return null;
    }

    //GETTERS & SETTERS:

    public boolean isLeito() {
        return leito;
    }

    public void setLeito(boolean leito) {
        this.leito = leito;
    }
}

package Classes;

import Classes.Assento;

public interface MeioTransporte {

    public boolean verificaOcupacao(String assento);

    public int quantidadeLivre();

    public void mostrarAssentos();

    public Assento getAssento(String assento);

}


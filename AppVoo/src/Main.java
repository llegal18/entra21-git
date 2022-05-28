import classes.Voo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Informe o número de linhas de assentos: ");
            int linhas = in.nextInt();
            if (linhas <= 26) {
                break;
            } else {
                System.out.println("QUANTIDADE DE LINHAS DEVE SER <= 26!");
            }
        }
        while (true) {
            System.out.print("Informe o número de cadeiras por linhas: ");
            int col = in.nextInt();
            if (col <= 10) {
                break;
            }
            in.nextLine();

            Voo v = new Voo(10, 10);
            while (v.quantidadeLivre() > 0) {
                v.mostrarAssentos();
                System.out.print("Informe o código do assento: ");
                String cod = in.nextLine();
                if (!v.verificaoOcupacao(cod)) {
                    v.ocupar(cod);
                    if (v.quantidadeLivre() == 0) {
                        break;
                    }
                } else {
                    System.out.println("CADEIRA OCUPADA! SELECIONE OUTRA CADEIRA!");
                }
            }
            v.mostrarAssentos();
            System.out.println("BOA VIAGEM!");
        }
    }
}

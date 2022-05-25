import classes.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("-MENU: Escolha uma opção-");
        System.out.println("(1) - X-Salada");
        System.out.println("(2) - X-Burguer");
        System.out.println("(3) - Misto Quente");
        System.out.println("(4) - Hot Dog");
        System.out.println("(5) - MiniPizza");

        Lanche lanche = null;

        int escolha = in.nextInt();
        switch (escolha) {
            case 1:
                lanche = new XSalada();

                break;

            case 2:
                lanche = new XBurguer();

                break;

            case 3:
                lanche = new MistoQuente();

                break;

            case 4:
                lanche = new HotDog();

                break;

            case 5:
                lanche = new MiniPizza();

                break;

            default:
                System.err.println("Escolha uma opção válida!");
        }
        if (escolha == 1 || escolha == 2) {
            System.out.println("Lanche aberto? (S/N)");
            in.nextLine();
            String aberto = in.nextLine();
            ((XBurguer) lanche).aberto = aberto.equalsIgnoreCase("S");
        }
        if (escolha == 5) {
            System.out.println("Deseja MiniPizza com borda recheada? (S/N)");
            in.nextLine();
            String bordaRecheada = in.nextLine();
            MiniPizza miniPizza = ((MiniPizza) lanche);
            miniPizza.bordaRecheada = bordaRecheada.equalsIgnoreCase("S");
            if (miniPizza.bordaRecheada) {
                System.out.print("Qual sabor da borda recheada? ");
                miniPizza.saborBorda = in.nextLine();
            }
        }
        System.out.print("Informe o valor de " + lanche.tipo + ": R$");
        lanche.valor = in.nextDouble();
        lanche.montarComanda();
    }
}

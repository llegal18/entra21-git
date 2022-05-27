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
        System.out.println("(5) - MiniPizza - Calabresa");

        Lanche lanche = null;

        int escolha = in.nextInt();
        in.nextLine();
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
        if (lanche instanceof XBurguer) {
            System.out.println("Lanche aberto? (S/N)");
            String aberto = in.nextLine();
            ((XBurguer) lanche).aberto = aberto.equalsIgnoreCase("S");
        }
        if (escolha == 5) {
            System.out.println("Deseja MiniPizza com borda recheada? (S/N)");
            String bordaRecheada = in.nextLine();
            MiniPizza miniPizza = ((MiniPizza) lanche);
            miniPizza.bordaRecheada = bordaRecheada.equalsIgnoreCase("S");
            if (miniPizza.bordaRecheada) {
                System.out.print("Qual sabor da borda recheada? ");
                miniPizza.saborBorda = in.nextLine();
            }
        }
        if (lanche instanceof Sanduiche) {
            //adicionais
            System.out.println("Deseja adicionais? (S/N)");
            String adicionar = in.nextLine();
            if (adicionar.equalsIgnoreCase("S")) {
                //adicionar os adicionais
                for (int i = 0; i < 10; i++) {
                    //pedir o adicional
                    System.out.println("Informe o adicional: ");
                    ((Sanduiche) lanche).adicionarAdicionais(in.nextLine());
                    System.out.println("Deseja adicionar mais adicionais? (S/N)");
                    String parada = in.nextLine();
                    if (parada.equalsIgnoreCase("N")) {
                        break;
                    }
                }
            }
        }
        System.out.print("Informe o valor de " + lanche.tipo + ": R$");
        lanche.valor = in.nextDouble();
        lanche.montarComanda();
    }
}

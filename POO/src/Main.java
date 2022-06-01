import classes.lanches.*;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        montarLanche();
    }

    private static void montarLanche() {
        System.out.println("-MENU: Escolha uma opção-");
        System.out.println("(1) - X-Salada");
        System.out.println("(2) - X-Burguer");
        System.out.println("(3) - Misto Quente");
        System.out.println("(4) - Hot Dog");
        System.out.println("(5) - MiniPizza");
        System.out.println("(6) - Pizza");

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

            case 6:
                lanche = new Pizza();

                break;

            default:
                System.err.println("Escolha uma opção válida!");
        }
        if (lanche instanceof XBurguer) {
            System.out.println("Lanche aberto? (S/N)");
            String aberto = in.nextLine();
            ((XBurguer) lanche).setAberto(aberto.equalsIgnoreCase("S"));
        }
        if (escolha == 5 || escolha == 6) {
            System.out.println("Escolha o sabor da pizza: ");
            System.out.println("(1) - 4 Queijos");
            System.out.println("(2) - Calabresa");
            System.out.println("(3) - Frango com catupiry");
            System.out.println("(4) - Marguerita");
            System.out.println("(5) - Portuguesa");
            int sabor = in.nextInt();
            in.nextLine();
            MiniPizza miniPizza = ((MiniPizza) lanche);

            switch (sabor) {
                case 1:
                    miniPizza.adicionarSaborEIngredientes("4 queijos");
                    break;
                case 2:
                    miniPizza.adicionarSaborEIngredientes("Calabresa");
                    break;
                case 3:
                    miniPizza.adicionarSaborEIngredientes("Frango com Catupiry");
                    break;
                case 4:
                    miniPizza.adicionarSaborEIngredientes("Marguerita");
                    break;
                case 5:
                    miniPizza.adicionarSaborEIngredientes("Portuguesa");
                    break;
                default:
                    System.err.println("Escolha um sabor válido!");
            }

            if (lanche instanceof Pizza) {
                System.out.println("Informe o tamanho da pizza: ");
                System.out.println("XS - Broto");
                System.out.println("SM - Pequena");
                System.out.println("MD - Média");
                System.out.println("LG - Grande");
                System.out.println("XL - Família");
                ((Pizza) lanche).setTamanho(in.nextLine().toUpperCase());
            }
            System.out.println("Deseja MiniPizza com borda recheada? (S/N)");
            String aberto = in.nextLine();
            miniPizza.setBordaRecheada(aberto.equalsIgnoreCase("S"));
            if (miniPizza.isBordaRecheada()) {
                System.out.print("Qual sabor da borda recheada? ");
                miniPizza.setSaborBorda(in.nextLine());
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
        System.out.print("Informe o valor de " + lanche.getTipo() + ": R$");
        lanche.setValor(in.nextDouble());
        lanche.montarComanda();
    }
}


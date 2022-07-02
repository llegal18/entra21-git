import classes.avaliacao.Avaliacao;
import classes.guardados.Estante;
import classes.itens.DVD;
import classes.itens.Item;
import classes.itens.Livro;
import classes.menu.EMenu;
import classes.menu.EMenuItem;
import classes.menu.IMenu;

import java.rmi.registry.LocateRegistry;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Estante e = new Estante(5);
        boolean loop = true;
        while (loop) {
            EMenu opcao = (EMenu) escolherOpcao(null);
            switch (opcao) {
                case SAIR -> loop = false;
                case ADICIONAR_ITEM -> adicionarItem(e);
                case BUSCAR_ITEM -> buscarItemTratarRetorno(e);
                case REMOVER_ITEM -> removerItem(e);
                case MOSTRAR_ITENS -> mostarItens(e);
                default -> System.out.println("Opção não implementada!");
            }
        }
        System.out.println("Programa finalizado!");
    }

    public static EMenu escolherOpcao(Item item) {
        IMenu escolha = null;
        while (escolha == null) {
            if (item != null) {
                while (escolha == null) {
                    System.out.println(item.getTitulo() + " encontrado! Ações disponíveis: ");
                    for (EMenuItem i : EMenuItem.values()) {
                        System.out.printf("(%d) %s\n", i.getValorOpcao(), i.getDescricao());
                    }
                    escolha = EMenuItem.getByValorOpcao(in.nextInt());
                    if (escolha == null) {
                        System.err.println("Selecione uma opção válida");
                    }
                }
            } else {
                System.out.println("Selecione uma opção");
                for (EMenu menu : EMenu.values()) {
                    System.out.printf("(%d) - %s\n", menu.getValorOpcao(), menu.getDescricao());
                }
                escolha = EMenu.getByValorOpcao(in.nextInt());
            }
            in.nextLine();
            if (escolha == null) {
                System.err.println("Selecione uma opção válida!");
            }
        }
        return escolha;
    }

    public static void adicionarItem(Estante estante) {
        if (estante.estanteCheia()) {
            System.out.println("Sua estante está cheia! Não é possível adicionar mais itens!");
        } else {
            Item item = null;
            int escolha = -1;
            while (escolha < 0 || escolha > 1) {
                System.out.print("Informe o item que deseja adicionar (0 - Livro / 1 - DVD)");
                escolha = in.nextInt();
                if (escolha < 0 || escolha > 1) {
                    System.err.println("Selecione uma opção válida!");
                }
            }
            in.nextLine();
            if (escolha == 0) {
                item = new Livro();
            } else {
                item = new DVD();
            }
            System.out.print("Informe o título: ");
            item.setTitulo(in.nextLine());
            System.out.print("Informe o gênero: ");
            item.setGenero(in.nextLine());
            System.out.print("Informe o valor: R$");
            item.setValor(in.nextDouble());
            in.nextLine();
            if (item instanceof Livro) {
                Livro livroItem = ((Livro) item);
            }
            if (item instanceof DVD) {
                DVD dvdItem = ((DVD) item);
                System.out.print("Informe o diretor do filme: ");
                dvdItem.setDiretor(in.nextLine());
                System.out.print("Informe a duração do filme: ");
                dvdItem.setDuracao(in.nextDouble());
                System.out.println("Informe o ano de lançamento: ");
                dvdItem.setAnoLancamento(in.nextInt());
                in.nextLine();
            }
            if (!estante.adicionarItem(item)) {
                System.err.println("Não foi possível adicionar o item na estante!");
            } else {
                System.out.println("Item adicionado com sucesso!");
            }
        }
    }

    public static void buscarItemTratarRetorno(Estante estante) {
        System.out.print("Informe o título para busca: ");
        Item i = estante.buscarItem(in.nextLine());
        if (i == null) {
            System.err.println("O título buscado não existe na estante!");
        } else {
            int escolha = -1;
            while (escolha < 0 || escolha > 2) {
                System.out.println(i.getTitulo() + " encontrado! Ações disponíveis: ");
                System.out.println("(1) - Ver avaliações");
                System.out.println("(2) - Avaliar");
                System.out.println("(0) - Voltar");
                escolha = in.nextInt();
                if (escolha < 0 || escolha > 2) {
                    System.err.println("Selecione uma opção válida");
                }
            }
            in.nextLine();
            switch (escolha) {
                case 0:
                    System.out.println("Retornando...");
                    break;
                case 1:
                    mostarAvaliacoes(i);
                    break;
                case 2:
                    i.avaliar();
                    break;
            }
        }
    }

    public static void mostarAvaliacoes(Item i) {
        for (Avaliacao a : i.getAvaliacoes()) {
            if (a != null) {
                System.out.println("Autor: " + a.getNome());
                System.out.println("avaliação: " + a.getRating());
                System.out.println("Comentário: ");
                System.out.println(a.getFeedback());
                System.out.println("--------------------");
            }
        }
        System.out.println("Classificação final: " + i.getTotalRating());
    }

    public static void removerItem(Estante e) {
        if (e.quantidadeItens() == 0) {
            System.err.println("Não é possível remover itens de uma estante vazia!");
        } else {
            int posicao = -1;
            while (posicao < 0 || posicao > e.getCapMaxima()) {
                System.out.print("Informe a posição do item para remover: ");
                posicao = in.nextInt();
                if (posicao < 0 || posicao > e.getCapMaxima()) {
                    System.err.println("Selecione uma opção válida!");
                }
            }
            in.nextLine();
            Item i = e.removerItem(posicao);
            if (i != null) {
                System.out.println("Item " + i.getTitulo() + " removido!");
            }
        }
    }

    public static void mostarItens(Estante e) {
        if (e.quantidadeItens() == 0) {
            System.out.println("Estante vazia!");
        } else {
            for (int i = 0; i < e.getCapMaxima(); i++) {
                Item item = e.getItens().get(i);
                if (item != null) {
                    System.out.println("[" + i + "] " + item.getTitulo() + " (" + item.getGenero() + ")");
                }
            }
        }
    }
}

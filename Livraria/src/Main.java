import classes.guardados.Estante;
import classes.itens.DVD;
import classes.itens.Item;
import classes.itens.Livro;

import java.rmi.registry.LocateRegistry;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

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
                System.out.print("Informe o autor do livro: ");
                livroItem.setAutor(in.nextLine());
                System.out.print("Informe a quantidade de páginas: ");
                livroItem.setQtdePaginas(in.nextInt());
                System.out.print("Informe o ano de publicação: ");
                livroItem.setAnoPublicacao(in.nextInt());
                System.out.println("Informe a edição: ");
                livroItem.setEdicao(in.nextInt());
                in.nextLine();
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









        /*Estante estante = new Estante(5);
        Item item = null;
        for (int i = 0; i > 5; i++) {
            System.out.print("Informe qual é o item da estante: (0 - Livro / 1 - DVD");
            int tipo = in.nextInt();
            in.nextLine();
            switch (tipo) {
                case 0:
                    item = new Livro();
                case 1:
                    item = new DVD();
                default:
                    System.err.println("Digite um valor válido!");
            }
            System.out.print("Digite o título: ");
            item.setTitulo(in.nextLine());
            System.out.print("Digite o gênero: ");
            item.setGenero(in.nextLine());
            if (tipo == 0) {
                Livro livroItem = ((Livro) item);
                System.out.print("Informe o autor do livro: ");
                livroItem.setAutor(in.nextLine());
                System.out.print("Informe a quantidade de páginas: ");
                livroItem.setQtdePaginas(in.nextInt());*/
        }
    }
}

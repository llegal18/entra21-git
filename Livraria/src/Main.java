import classes.guardados.Estante;
import classes.itens.Item;
import classes.itens.Livro;
import classes.*;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Estante estante = new Estante(5);
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe qual é o item da estante: (1 - Livro / 2 - DVD");
            int itemE = in.nextInt();
            System.out.print("Informe o título do item: ");
            String estanteNome = in.nextLine();
            System.out.print(" Informe o gênero do item: ");
        }







        /*Livro l = new Livro();
        l.setTitulo("Harry Potter e a Autora Transfóbica");
        l.avaliar();
        l.avaliar();
        l.avaliar();
        System.out.println(l.getTotalRating());*/
    }
}

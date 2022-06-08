import classes.itens.Livro;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Livro l = new Livro();
        l.setTitulo("Harry Potter e a Autora Transfóbica");
        l.avaliar();
        l.avaliar();
        l.avaliar();
        System.out.println(l.getTotalRating());
    }
}

import classes.Tarefa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Tarefa t = new Tarefa();
        System.out.println("Digite o nome da Tarefa: ");
        t.setNome(in.nextLine());
        System.out.println("Digite a descrição: ");
        t.setDescricao(in.nextLine());

        System.out.println(t.getUUID());
        System.out.println(t.getNome());
        System.out.println(t.getDescricao());
    }
}

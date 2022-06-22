import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main3 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        HashMap<String, ArrayList<Carro>> carros = new HashMap<>();
        while (true) {
            System.out.println("--------------------------------");
            System.out.println("Menu:");
            System.out.println("1 - Ver catálogo");
            System.out.println("2 - Adicionar carro ao catálogo");
            System.out.println("3 - Vender");
            System.out.println("0 - Sair");
            System.out.println("--------------------------------");
            int escolha = in.nextInt();
            in.nextLine();
            switch (escolha) {
                case 1:
                    if (carros.isEmpty()) {
                        System.out.println("Não há produtos cadastrados!");
                    } else {
                        System.out.println("Informe o produto: ");
                        String busca = in.nextLine().toLowerCase();
                        if (carros.containsKey(busca)) {
                            System.out.println(busca + " : " + carros.get(busca));
                        } else {
                            System.out.println("Produto '" + busca + "' não encontrado!");
                        }
                    }

            }
            break;
        }
    }
}

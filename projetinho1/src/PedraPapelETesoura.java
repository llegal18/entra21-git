import java.util.Random;
import java.util.Scanner;

public class PedraPapelETesoura {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner in = new Scanner(System.in);

        int pontuaçãoJ1 = 0;
        int pontuaçãoJ2 = 0;
        while (pontuaçãoJ1 < 10 && pontuaçãoJ2 < 10) {
            //usuário
            int escolhaUsuário = -1;
            boolean valida = escolhaValida(escolhaUsuário);
            while (!valida) {
                System.out.println("Escolha (0) Pedra, (1) Papel ou (2) Tesoura: ");
                escolhaUsuário = in.nextInt();
                valida = escolhaValida(escolhaUsuário);
                if (!valida) {
                    System.out.println("Escolha inválida!");

                }
            }
            String escolhaUsuarioString = escolhaString(escolhaUsuário);
            //computador
            int escolhaComputador = r.nextInt(4);
            String escolhaComputadorString = escolhaString(escolhaComputador);
            System.out.println("(Jogador) " + escolhaUsuarioString + " X " + escolhaComputadorString + " (Computador)");
            int vencedor = checarVencedor(escolhaUsuário, escolhaComputador);
            switch (vencedor) {
                case 0:
                    System.out.println("Empate!");
                    break;
                case 1:
                    System.out.println("Usuário venceu!");
                    break;
                case 2:
                    System.out.println("Computador venceu!");
                    break;
            }
            System.out.println("==== Pontuação ====");
            System.out.println("Usuário: " + pontuaçãoJ1);
            System.out.println("Computador: " + pontuaçãoJ2);
            System.out.println("");
        }
    }

    public static boolean escolhaValida(int escolha) {
        return escolha > -1 && escolha < 3;
    }

    public static String escolhaString(int escolha) {
        switch (escolha) {
            case 0:
                return "Pedra";
            case 1:
                return "Papel";
            case 2:
                return "Tesoura";
            case 3:
                return "Lava";
            default:
                return "";
        }
    }

    public static int checarVencedor(int escolha1, int escolha2) {
        // 0 - empate
        // 1 - escolha1 vence
        // 2 - escolha2 vence
        if (escolha1 == escolha2) {
            return 0;
        }

        if (escolha1 == 3) {
            return 1;
        } else if (escolha2 == 3) {
            return 2;
        }

        if      ((escolha1 == 0 && escolha2 == 1) ||
                (escolha1 == 1 && escolha2 == 2) ||
                (escolha1 == 2 && escolha2 == 0)) {
            return 2;
        }

        return 1;

    }
}



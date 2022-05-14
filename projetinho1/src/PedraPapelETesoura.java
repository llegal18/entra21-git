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
            while (escolhaValida(escolhaUsuário)) {
                System.out.println("Escolha (0) Pedra, (1) Papel ou (2) Tesoura: ");
                escolhaUsuário = in.nextInt();
                if (!escolhaValida(escolhaUsuário)) {
                    System.out.println("Escolha inválida!");

                }
            }
            switch (escolhaUsuário) {
                case 0:
                    System.out.println("Pedra");
                    break;
                case 1:
                    System.out.println("Papel");
                    break;
                case 2:
                    System.out.println("Tesoura");
                    break;
            }
            String escolhaUsuarioString = escolhaString(escolhaUsuário);
            //computador
            int escolhaComputador = r.nextInt(3);
            String escolhaComputadorString = escolhaString(escolha);
            System.out.println("(Jogador) " + escolhaString(escolhaUsuário) + "X " + escolhaComputadorString);
            if (escolhaUsuário == escolhaComputador) {
                System.out.println("EMPATE");
            } else if () {

            }

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
            default:
                return "ERROU";
        }
    }
}



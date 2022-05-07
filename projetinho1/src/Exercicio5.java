import java.util.Scanner;

public class Exercicio5 {

    // 1. Pedir ao usuário quantas palavras ele deseja informar;
    // 2. Pedir ao usuário cada palavra;
    // 3. Informar em uma única linha as palavras que o usuário informou separadas por vírgula;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe a quantidade de palavras que você deseja: ");
        int qtdePal = in.nextInt();
        String[] palavras = new String[qtdePal];
        for (int bat = 0; bat < qtdePal; bat++) {
            System.out.print("Informe as palavra: ");
            palavras[bat] = in.next();
        }
        String palavraFinal = "";
        for (int bat = 0; bat < palavras.length; bat++) {
            if (bat == 0) {
                palavraFinal += palavras[bat];
            } else {
                palavraFinal += ", " + palavras[bat];
            }
        }
        System.out.println(palavraFinal);
    }
}

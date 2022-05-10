import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        exe06();
    }

    public static void exe01() {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = in.nextLine();
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                contador++;
            }
        }
        System.out.println("A quantidade de espaços é: " + contador);
    }

    public static void exe02() {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe o número da linha da matriz: ");
        int linhas = in.nextInt();
        System.out.print("Informe o número da coluna da matriz: ");
        int colunas = in.nextInt();

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }

    public static void exe03() {
        Scanner in = new Scanner(System.in);
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe um número inteiro: ");
            soma += in.nextInt();
        }
        System.out.println("A soma é: " + soma);
    }

    public static void exe04() {
        Scanner in = new Scanner(System.in);
        int tentativas = 3;
        while (tentativas > 0) {
            System.out.print("Informe seu PIN: ");
            int pin = in.nextInt();
            if (pin == 91352) {
                System.out.print("ACESSO LIBERADO!");
                break;
            }
            tentativas--;
            if (tentativas == 0) {
                System.out.println("ACESSO BLOQUEADO!");
            } else {
                System.out.println("PIN incorreto,tente novamente!");
            }
        }
    }

    public static void exe05() {
        Scanner in = new Scanner(System.in);
    }

    public static void exe06() {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();


    }
}

// w3schools.com


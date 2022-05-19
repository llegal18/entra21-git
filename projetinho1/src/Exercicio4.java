import java.util.Random;
import java.util.Scanner;

public class Exercicio4 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
    }

    public static void exe01() {
        /* Escreva um programa que solicite ao usuário que insira um número inteiro e, em seguida,
        emita o número com os dígitos invertidos. Por exemplo, se a entrada for 12345, a saída deverá ser 54321. */
        System.out.print("Informe um número: ");
        String numero = String.valueOf(in.nextInt());
        String inverso = "";
        for (int i = numero.length() - 1; i >= 0; i--) {
            inverso = inverso + String.valueOf(numero.charAt(i));
        }
        System.out.println(inverso);
    }

    public static void exe0101() {
        System.out.print("Informe um número: ");
        String numero = String.valueOf(in.nextInt());
        String inverso = "";
        for (int i = numero.length() - 1; i >= 0; i--) {
            System.out.print(numero.charAt(i));
        }
    }

    public static void exe02() {
        /* Escreva um programa para inserir quantos números o usuário querer e no final o programa deve exibir o maior
        e o menor número inserido. */
        int maior = 0, menor = 0;
        int parada = -1;
        boolean primeiro = true;
        while (parada != 0) {
            int paradaAnt = parada;
            System.out.print("Informe um número (0 para sair): ");
            parada = in.nextInt();
            if (primeiro) {
                menor = parada;
                maior = parada;
                primeiro = false;
            } else {
                if (parada > maior) {
                    maior = parada;
                }
                if (parada < menor) {
                    menor = parada;
                }
                if (parada < menor) {
                    menor = parada;
                }
            }
        }
        System.out.println("Menor valor informado: " + menor);
        System.out.println("Maior valor informado: " + maior);
    }

    public static void exe03() {
        System.out.print("Informe um número: ");
        int numero = in.nextInt();

        int soma = 0;
        // for
        for (int i = 1; i <= numero; i++) {
            soma += i;
        }
        System.out.println(soma);
        soma = 0;
        //while
        while (numero>0) {
            soma += numero;
            numero--;
        }
        System.out.println(soma);
    }

    public static void exe04() {
        /* Escreva um programa que gere um número aleatório e peça ao usuário adivinhar qual é o número. Se o palpite
        do usuário for maior do que o número aleatório, o programa dever exibir "Muito alto, tente novamente.". Se o
        palpite do usuário for menor que o número aleatório, o progama deve exibir "Muito baixo, tente novamente.".
        O programa deve usar um loop que se repete até que o usuário adivinhe corretamente o número aleatório. */
        Random r = new Random();
        int randomico = r.nextInt(101);
        int chutes = 0;
        while (true) {
            System.out.println("Informe um número: ");
            int valorInformado = in.nextInt();
            chutes++;
            if (valorInformado == randomico) {
                System.out.println("ACERTOU MIZERAVI");
                break;
            } else if (valorInformado > randomico) {
                System.out.println("Chutou muito alto, tente de novo!");
            } else {
                System.out.println("Chutou muito baixo, tente de novo!");
            }
        }
        System.out.println("Você chutou " + chutes + "vezes");
    }

    public static void exe05() {
        /* Escreva um programa para imprimir a seguir. */
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");

        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i + j < 4) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        System.out.println("");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                if (i + j < 4 || j - i > 4) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        System.out.println("");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                if (i + j < 4 || j - i > 4) {
                    System.out.print(" ");
                } else {
                    System.out.print(i + 1);
                }
            }
            System.out.println("");
        }
        System.out.println("");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                if (i + j < 4 || j - i > 4) {
                    System.out.print(" ");
                } else if (j > 4) {
                    System.out.print(Math.abs(j - 3));
                } else {
                    System.out.print(Math.abs(j - 5));
                }
            }
            System.out.println("");
        }
    }
}

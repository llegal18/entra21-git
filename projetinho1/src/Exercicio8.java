import java.util.Random;
import java.util.Scanner;

public class Exercicio8 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        exe04();

    }

    public static void exe01() {
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

    public static void exe04() {
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

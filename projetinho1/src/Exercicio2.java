import java.util.Scanner;
public class Exercicio2 {

    public static void main(String[] args) {
        exe07();
    }

    public static void exe01() {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe um valor: ");
        int valor = in.nextInt();

        if (valor > 10) {
            System.out.println("É maior que 10!");
        } else {
            System.out.println("Não é maior que 10!");
        }
    }

    public static void exe02() {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe um valor: ");
        int valor = in.nextInt();

        if (valor >= 0) {
            System.out.println("O número " + valor + " é positivo!");
        } else {
            System.out.println("O número " + valor + " é negativo!");
        }
    }

    public static void exe03() {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe a quantidade de maçãs compradas: ");
        int macas = in.nextInt();

        if (macas <= 12) {
            double preco = macas * 1.30;
            System.out.printf("O valor total da compra é: R$ %.2f\n", preco);
        } else {
            double preco2 = macas * 1.00;
            System.out.printf("O valor total da compra é: R$ %.2f\n", preco2);
        }
    }

    public static void exe04() {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe o ano atual: ");
        int ano = in.nextInt();
        System.out.print("Informe seu ano de nascimento: ");
        int anoNasc = in.nextInt();
        int idade = ano - anoNasc;

        if (idade > 16) {
            System.out.printf("Você poderá votar esse ano!", idade);
        } else {
            System.out.printf("Você não poderá votar esse ano!", idade);
        }
    }

    public static void exe05() {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe o primeiro valor: ");
        int valor1 = in.nextInt();
        System.out.print("Informe o segundo valor: ");
        int valor2 = in.nextInt();

        if (valor1 > valor2) {
            System.out.printf("O valor 1 é maior!", valor1);
        } else {
            System.out.printf("O valor 2 é maior!", valor2);
        }
    }

    public static void exe055() {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe o primeiro valor: ");
        int valor1 = in.nextInt();
        System.out.print("Informe o segundo valor: ");
        int valor2 = in.nextInt();

        System.out.println(Math.max(valor1, valor2));
    }

    public static void exe06() {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe o primeiro valor: ");
        int valor1 = in.nextInt();
        System.out.print("Informe o segundo valor: ");
        int valor2 = in.nextInt();

        if (valor1 > valor2) {
            System.out.println(valor2);
            System.out.println(valor1);
        } else {
            System.out.println(valor1);
            System.out.println(valor2);
        }
    }

    public static void exe07() {
        Scanner in = new Scanner(System.in);
        System.out.print("Que horas começou o jogo de Xadrez? ");
        int horaInc = in.nextInt();
        System.out.print("Que horas acabou o jogo de Xadrez? ");
        int horaFim = in.nextInt();

        if (horaInc > horaFim) {
            System.out.printf("Duração do jogo: %d", 24 - (horaInc - horaFim));
        } else {
            System.out.printf("Duração do jogo: %d", horaInc - horaFim);
        }
    }

    public static void exe08() {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe a quantidade de horas trabalhadas: ");
        int horaInc = in.nextInt();
        System.out.print("Que horas acabou o jogo de Xadrez? ");
        int horaFim = in.nextInt();

    }

    public static void exe09() {
        Scanner in = new Scanner(System.in);
        System.out.print("Informa seu salário fixo: ");

    }

}









import java.util.Scanner;

public class Exercicio2 {

    //if e else

    public static void main(String[] args) {
        exe08();
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
        int horasTrab = in.nextInt();
        System.out.print("Informe o valor por hora do funcionário: ");
        double valorH = in.nextDouble();

        double salario;
        if (horasTrab > 160) {
            salario = 160 * valorH + ((horasTrab - 160) * (valorH - valorH / 2));
        } else {
            salario = horasTrab * valorH;
        }
        System.out.printf("O salário é: R$ %.2f", salario);
    }

    public static void exe09() {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe o seu nome: ");
        String nome = in.next();
        System.out.print("Informe a sua altura: ");
        double altura = in.nextDouble();
        System.out.print("Informe seu sexo (M/F)");
        String sexo = in.next();

        double peso;
        if (sexo.equals("M")) {
            peso = (72.7 * altura) - 58;
        } else {
            peso = (62.1 * altura) - 44.7;
        }
        System.out.printf("Peso ideal: %.2f", peso);
    }

    public static void exe10() {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe o salário fixo: R$");
        double salFixo = in.nextDouble();
        System.out.print("Informe o valor total das vendas: R$");
        double valorVendas = in.nextDouble();
        double salFinal;

        if (valorVendas > 1500) {
            salFinal = salFixo + (1500 * 0.03);
            double exedente = valorVendas - 1500;
            salFinal += exedente * 0.05;
        } else {
            salFinal = salFixo + (valorVendas * 0.03);
        }
        System.out.printf("Salário final: R$%.2f", salFinal);
    }

    public static void exe11() {
        Scanner in = new Scanner(System.in);
        System.out.print("Número da conta: ");
        String numConta = in.next();
        System.out.print("Valor do saldo: R$");
        double saldoAtual = in.nextDouble();
        System.out.print("Valor do crédito: R$");
        double credito = in.nextDouble();
        System.out.print("Valor do débito: R$");
        double debito = in.nextDouble();

        double saldoFinal = saldoAtual - debito + credito;
        System.out.printf("Saldo final da conta %s: R$%.2f\n", numConta, saldoFinal);
        if (saldoFinal < 0) {
            System.out.println("SALDO NEGATIVO!");
        } else {
            System.out.println("SALDO POSITIVO!");
        }
    }

    public static void exe12() {
        Scanner in = new Scanner(System.in);
        System.out.print("Quantidade de estoque: ");
        double qtdeAtual = in.nextDouble();
        System.out.print("Quantidade mínima de estoque: ");
        double qtdeMinima = in.nextDouble();
        System.out.print("Quantidade máxima de estoque: ");
        double qtdeMaxima = in.nextDouble();

        double mediaEstoque = (qtdeMaxima + qtdeMinima) / 2;
        if (qtdeAtual >= mediaEstoque) {
            System.out.println("Não efetuar compra!");
        } else {
            System.out.println("Efetuar compra!");
        }
    }
}









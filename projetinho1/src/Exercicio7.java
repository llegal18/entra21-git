import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        exe04();
    }

    public static void exe01() {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe seu nome: ");
        String nome = in.next();
        System.out.print("Informe seu sobrenome: ");
        String sobrenome = in.next();
        System.out.println((nome.charAt(0) + ".") + " " + (sobrenome.charAt(0) + "."));
    }

    public static void exe0101() {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe seu nome completo: ");
        String nomeComp = in.nextLine();
        String[] nomes = nomeComp.split(" ");
        System.out.println(nomes[0].charAt(0) + ". " + nomes[1].charAt(0) + ".");
    }

    public static void exe02() {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite a palavra: ");
        String palavra = in.nextLine();
        String palindromo = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {
            palindromo += palavra.charAt(i);
        }

        if (palindromo.equals(palavra)) {
            System.out.printf("É um palíndromo!\n", palindromo);
        } else {
            System.out.printf("Não é um palíndromo!\n", palindromo);
        }
        // reverse = new StringBuilder(palavra).reverse().toString();
    }

    public static void exe03() {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double number = in.nextDouble();
        System.out.println((number - 1) + ", " + (number + 1));
    }

    public static void exe04() {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe o primeiro número: ");
        int num1 = in.nextInt();
        System.out.print("Informe o segundo número: ");
        int num2 = in.nextInt();

        int soma = num1 + num2;
        int subt = num1 - num2;
        int multi = num1 * num2;
        int div = num1 / num2;

        System.out.printf("O resultado da soma é: %d\n", soma);
        System.out.printf("O resultado da subtração é: %d\n", subt);
        System.out.printf("O resultado da multiplicação é: %d\n", multi);
        System.out.printf("O resultado da divisão é: %d\n", div);
    }

    public static void exe05() {
        Scanner in = new Scanner(System.in);


    }
}


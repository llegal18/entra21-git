import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        exe02();
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
}

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //exe01();
        //exe02();
        //exe03();
    }

    public static void exe01() {
        // Pedir pro usuário informar n números inteiros até ele digitar 0
        // Quando ele digitar 0, mostrar a lista dos números digitados por ele
        ArrayList inteiros = new ArrayList();
        while (true) {
            System.out.print("Informe um valor inteiro: ");
            int escolha = in.nextInt();
            inteiros.add(escolha);
            if (escolha == 0) {
                break;
            }
        }
        System.out.println("Valores informados: ");
        System.out.println(inteiros);
        /*for (int i = 0; i < inteiros.size(); i++) {
            if (i > 0 && i < inteiros.size()) {
                System.out.print(", ");
            }
            System.out.print(inteiros.get(i));*/
    }

    public static void exe02() {
        // Pedir pro usuário informar valores inteiros até que seja informado 0
        // Quando for informado 0, mostrar os valores que o usuário digitou
        // Mostrar a soma dos números pares e dos números ímpares informados
        // Mostrar a média de todos os valores informados
        ArrayList<Integer> inteiros = new ArrayList<>();
        int somaPar = 0, somaImpar = 0;
        double somaTotal = 0;
        while (true) {
            System.out.print("Informe um valor inteiro: ");
            int escolha = in.nextInt();
            if (escolha % 2 == 0) {
                somaPar += escolha;
            } else {
                somaImpar += escolha;
            }
            somaTotal += escolha;
            inteiros.add(escolha);
            if (escolha == 0) {
                break;
            }
        }
        System.out.println("Valores informados: " + inteiros);
        System.out.print("Soma dos valores pares: " + somaPar);
        System.out.print("Soma dos valores ímpares: " + somaImpar);
        System.out.print("Média dos valores informados: " + (somaTotal / inteiros.size()));
    }

    public static void exe03() {
        /* 1 - Ler o input do usuário (String) até que seja informado SAIR
           2 - Pedir pro usuário um valor inteiro > 0
           3 - Remover da lista as palavras que tenha a quantidade de caracteres menor que o número informado
           4 - Mostrar a lista de palavras */
        ArrayList<String> palavras = new ArrayList<>();
        while (true) {
            System.out.println("Digite as palavras desejadas: (SAIR para encerrar o programa)");
            String pal = in.nextLine();
            if (pal.equalsIgnoreCase("sair")) {
                break;
            }
            palavras.add(pal);
        }
        System.out.print("Informe um valor inteiro: ");
        int valorInt = in.nextInt();
        for (int i = 0; i < palavras.size(); i++) {
            if (palavras.get(i).length() < valorInt) {
                palavras.remove(i);
                i--;
            }
        }
        System.out.println(palavras);
    }
}


/*
int --> Integer
double --> Double
char --> Character
boolean --> Boolean
Character c = 'c';
Integer i = 10;
i = null;
ArrayList arr;
*/

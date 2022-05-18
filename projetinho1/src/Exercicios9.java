import java.util.Scanner;

public class Exercicios9 {
    // Strings
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        exe10();
    }

    public static void exe01() {
        // método das Strings do java:
        System.out.print("Digite algo: ");
        String algo = in.nextLine();

        System.out.println("Length: " + algo.length());
        System.out.println("Empty: " + algo.isEmpty());
        System.out.println("Uppercase: " + algo.toUpperCase());
        System.out.println("Lowercase: " + algo.toLowerCase());
    }

    public static void exe02() {
        /* Escreva um programa que leia duas Strings da entrada e verifique se elas são iguais
         ou apenas iguais com maiúsculas e minúsculas ignoradas */
        System.out.print("Digite alguma coisa: ");
        String algumaCoisa = in.nextLine();
        System.out.print("Digite alguma coisa (de novo): ");
        String algumaOutraCoisa = in.nextLine();

        if (algumaCoisa.equals(algumaOutraCoisa)) {
            System.out.println("São exatamente iguais");
        } else if (algumaCoisa.equalsIgnoreCase(algumaOutraCoisa)) {
            System.out.println("São iguais independente de case");
        } else {
            System.out.println("São diferentes");
        }
    }

    public static void exe03() {
        /* Escreva um programa que leia duas Strings do usuário e produza se uma for parte da outra */
        System.out.print("Digite alguma coisa: ");
        String algumaCoisa = in.nextLine();
        System.out.print("Digite alguma coisa (de novo): ");
        String algumaOutraCoisa = in.nextLine();

        if (algumaCoisa.contains(algumaOutraCoisa)) {
            System.out.println(algumaOutraCoisa + " faz parte de " + algumaCoisa);
        } else if (algumaOutraCoisa.contains(algumaCoisa)) {
            System.out.println(algumaCoisa + " faz parte de " + algumaOutraCoisa);
        } else {
            System.out.println("Nenhuma string faz parte da outra");
        }
    }

    public static void exe04() {
        /* Escreva um programa que leia duas Strings do usuário e produza se uma palavra for o prefixo (primeira parte)
         da outra */
        System.out.print("Digite alguma coisa: ");
        String algumaCoisa = in.nextLine();
        System.out.print("Digite alguma coisa (de novo): ");
        String algumaOutraCoisa = in.nextLine();

        if (algumaCoisa.startsWith(algumaOutraCoisa)) {
            System.out.println(algumaOutraCoisa + " é prefixo de " + algumaCoisa);
        } else if (algumaOutraCoisa.startsWith(algumaCoisa)) {
            System.out.println(algumaCoisa + "é prefixo de " + algumaOutraCoisa);
        } else {
            System.out.println("As strings não são prefixo uma da outra");
        }
    }

    public static void exe05() {
        /* Escreva um programa que leia duas Strings do usuário e produza se uma palavra for o sufixo (última parte)
         da outra */
        System.out.print("Digite alguma coisa: ");
        String algumaCoisa = in.nextLine();
        System.out.print("Digite alguma coisa (de novo): ");
        String algumaOutraCoisa = in.nextLine();

        if (algumaCoisa.endsWith(algumaOutraCoisa)) {
            System.out.println(algumaOutraCoisa + " é sufixo de " + algumaCoisa);
        } else if (algumaOutraCoisa.endsWith(algumaCoisa)) {
            System.out.println(algumaCoisa + "é sufixo de " + algumaOutraCoisa);
        } else {
            System.out.println("As strings não são sufixo uma da outra");
        }
    }

    public static void exe06() {
        /* Escreva um programa que imprima o índice e o caractere de uma determinada palavra; */
        System.out.print("Digite alguma coisa: ");
        String algumaCoisa = in.nextLine();
        System.out.print("Digite alguma coisa (de novo): ");
        String algumaOutraCoisa = in.nextLine();

        int pos = algumaCoisa.indexOf(algumaOutraCoisa);
        System.out.println("A posição de " + algumaOutraCoisa + " em " + algumaCoisa + " é " + pos);
    }

    public static void exe07() {
        /* Use o método replace para decifrar essa String:
        lala#lwve#-rwgra22lalang!#<3
            The code is:

            | Code |    Letter  |
            | w    | o          |
            | #    | `` (space) |
            | 2    | m          |
            | lala | i          |
            | -    | p          | */

        String cyphered = "lala#lwve#-rwgra22lalang!#<3";
        String decyphered = cyphered.replace("w", "o");
        decyphered = decyphered.replace("#", " ");
        decyphered = decyphered.replace("2", "m");
        decyphered = decyphered.replace("lala", "i");
        decyphered = decyphered.replace("-", "p");
        System.out.println(decyphered);
    }

    // Arrays
    public static void exe08() {
        /* Escreva um programa que leia um conjunto de inteiros e imprima a soma dos inteiros pares e ímpares */
        System.out.print("Informe a quantidade de números: ");
        int nums = in.nextInt();
        int[] numeros = new int[nums];

        for (int i = 0; i < nums; i++) {
            System.out.print("Informe um número: ");
            numeros[i] = in.nextInt();
        }
        int somaPar = 0, somaImpar = 0;

        for (int i = 0; i < numeros.length; i++) {
            int valor = numeros[i];
            if (valor % 2 == 0) {
                somaPar += valor;
            } else {
                somaImpar += valor;
            }
        }
        //for (int valor : numeros) {}
        System.out.println("Soma dos valores pares: " + somaPar);
        System.out.println("Soma dos valores ímpares: " + somaImpar);
    }

    public static void exe09() {
        /* 1 - Deixe o usuário escolher quantas palavras deseja inserir
        2 - Leia quantas palavras
        3 - Deixe o usuário escolher um número maior que 0
        4 - Remova todas as palavras do array que sejam menores que o número dado */
        System.out.print("Informe a quantidade de palavras: ");
        int nums = in.nextInt();
        String[] palavras = new String[nums];
        in.nextLine();

        for (int i = 0; i < nums; i++) {
            System.out.print("Informe uma palavra: ");
            palavras[i] = in.nextLine();
        }
        System.out.print("Informe um número > 0: ");
        int numeroCorte = in.nextInt();

        for (int i = 0; i < nums; i++) {
            if (palavras[i].length() < numeroCorte) {
                palavras[i] = null;
            } /* else {
                System.out.println(palavras[i]);
            } */
        }
        for (String palavra : palavras) {
            if (palavra != null) {
                System.err.println(palavra);
            }
        }
    }

    public static void exe10() {
        /* Pegue duas listas como entrada e retorne uma nova lista com todos os valores da primeira lista que não
         estão na segunda lista */
        System.out.print("Informe a quantidade de números da primeira lista: ");
        int qntNum1 = in.nextInt();
        int[] Lista1 = new int[qntNum1];

        for (int i = 0; i < qntNum1; i++) {
            System.out.print("Informe um número: ");
            Lista1[i] = in.nextInt();
        }
        System.out.print("Informe a quantidade de números da Lista 2: ");
        int qntNum2 = in.nextInt();
        int[] Lista2 = new int[qntNum2];

        for (int i = 0; i < qntNum2; i++) {
            System.out.print("Informe um número: ");
            Lista2[i] = in.nextInt();
        }
        for (int valor1 : Lista1) {
            boolean achou = false;
            for (int valor2 : Lista2) {
                if (valor1 == valor2) {
                    achou = true;
                    break;
                }
            }
            if (!achou) {
                System.out.println(valor1);
            }
        }
    }
}

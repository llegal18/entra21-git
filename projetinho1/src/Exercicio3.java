import java.util.Scanner;

public class Exercicio3 {

    //Repetição

    public static void main(String[] args) {
    }

    public static void exe01() {
        String[] palavras = {"abc", "def", "ghi"};
        char letraProibida = 'a';
        boolean achou = false;
        for (String palavra : palavras) {
            for (int i = 0; i < palavra.length(); i++) {
                achou = palavra.charAt(i) == letraProibida;
                if (achou) {
                    break;
                }
            }

        }
        if (achou) {
            System.out.println("Encontrou a letra proibida");
        } else {
            System.out.println("Não encontrou a letra proibida");
        }
    }

    /*System.out.println(forbiddenLetter(new String[]{"abc", "def", "ghi"},'a'));
}

public static boolean forbiddenLetter (String[] palavras, char letraProibida){
    boolean achou=false;
    for(String palavra:palavras){
    for(int i=0;i<=palavra.length();i++){
    achou=palavra.charAt(i)==letraProibida;
    if(achou){
    break;
    }
    }
    if(achou){
    break;
    }
    }

    return achou;
    }*/

    public static void exe02() {
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

    public static void exe03() {
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

    public static void exe04() {
        Scanner in = new Scanner(System.in);
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe um número inteiro: ");
            soma += in.nextInt();
        }
        System.out.println("A soma é: " + soma);
    }

    public static void exe05() {
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

    public static void exe06() {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int number = in.nextInt();

        int soma = 0;
        for (int i = 0; i <= number; i++) {
            soma += i;
        }
        System.out.println(soma);
        soma = 0;
    }

    public static void exe07() {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int number = in.nextInt();

        int soma = 0;
        while (number > 0) {
            soma += number;
            number--;
        }
        System.out.println(soma);
    }

    public static void exe08() {
        Scanner batata = new Scanner(System.in);
        System.out.println("Qual tabuada deseja saber? ");
        int valor = batata.nextInt();
        while (valor != 0) {
            for (int potat = 0; potat <= 10; potat++) {
                System.out.println(potat * valor);
            }
            System.out.println("Qual tabuada deseja saber? ");
            valor = batata.nextInt();
        }
    }

    public static void exe09() {
        // 1. Pedir ao usuário quantas palavras ele deseja informar;
        // 2. Pedir ao usuário cada palavra;
        // 3. Informar em uma única linha as palavras que o usuário informou separadas por vírgula;
        Scanner in = new Scanner(System.in);
        System.out.print("Informe a quantidade de palavras que você deseja: ");
        int qtdePal = in.nextInt();
        String[] palavras = new String[qtdePal];

        for (int i = 0; i < qtdePal; i++) {
            System.out.print("Informe as palavra: ");
            palavras[i] = in.next();
        }

        String palavraFinal = "";
        for (int i = 0; i < palavras.length; i++) {
            if (i == 0) {
                palavraFinal += palavras[i];
            } else {
                palavraFinal += ", " + palavras[i];
            }
        }
        System.out.println(palavraFinal);
    }

    public static void exe10() {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe seu nome: ");
        String nome = in.next();
        System.out.print("Informe seu sobrenome: ");
        String sobrenome = in.next();
        System.out.println((nome.charAt(0) + ".") + " " + (sobrenome.charAt(0) + "."));
    }

    public static void exe1010() {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe seu nome completo: ");
        String nomeComp = in.nextLine();
        String[] nomes = nomeComp.split(" ");
        System.out.println(nomes[0].charAt(0) + ". " + nomes[1].charAt(0) + ".");
    }

    public static void exe11() {
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

    public static void exe12() {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double number = in.nextDouble();
        System.out.println((number - 1) + ", " + (number + 1));
    }

    public static void exe13() {
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

    public static void exe14() {


    }
}




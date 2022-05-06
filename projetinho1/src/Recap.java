import java.util.Scanner;
public class Recap {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isHealer = true;
        while (isHealer) {
            System.out.println("Informe a abreviação da Classe: ");
            String clazz = in.next();
            if (clazz.length() != 3) {
                System.out.println("Não é uma abreviação válida!");
            } else {
                switch (clazz.toUpperCase()) {
                    case "PLD", "WAR", "DKN", "GNB":
                        System.out.println("Essa classe é Tank!");
                        break;
                    case "WHM", "SCH", "AST", "SAG":
                        System.out.println("Essa classe é Healer!");
                        break;
                    case "MNR", "DRG", "NJA", "SMR", "RPR", "DNC", "BLM", "SMN", "RDM", "BEM", "BRD", "MCH":
                        System.out.println("Essa classe é DPS!");
                        break;
                    default:
                        System.out.println("Não é uma classe válida!");
                        isHealer = false;
                        break;
                }
            }
        }
    }
}

//        String var3 = "Did you know about the aclameid MMO FFXIV?"
//        int qtde = 0;
//        for (int i = 0; i < var3.length(); i++) {
//            if (var3.toLowerCase().charAt(i) == 'a') {
//                qtde++;
//            }
//        }
//        System.out.println(qtde);

//        public static void text() {
//        // inteiros:
//        int var1 = 10;
//        // caractere único:
//        char var2 = 'a';
//        // texto:
//        String var3 = "abcdefghijk";
//        // valor lógico:
//        boolean var 4 = true;
//        // decimais, números quebrados:
//        double var 5 = 5.6;
//        float //double é melhor que o float
//        // saída - mensagem ao usuário
//        System.out.println(); // exibe mensagem e quebra a linha
//        System.out.print(""); // exibe mensagem sem quebra de linha
//        System.out.printf("%d %.2f, %s", 10, 4.67888, "texto"); //exibe mensagem formatada sem quebra de linha
//
//        // entrada - entrada de usuário PELO CONSOLE
//        Scanner in = new Scanner(System.in);
//        in.next(); // espera o usuário digitar, pega tudo o que foi digitado
//        in.nextInt(); // espera o usuário digitar, pega valores inteiros
//        in.nextDouble(); // espera o usuário digitar, pega valores decimais
//
//        //operações aritméticas
//        var1 = 10 + 10; // soma
//        var1 = 10 - 10; // subtração
//        var1 = 10 / 10; // divisão
//        var1 = 10 * 10; // multiplicação
//        var1 = 10 % 10; // resto de divisão - módulo
//
//        // operações relacionais - SEMPRE RETORNAM VALOR BOOLEAN
//        var1 = 10 > 10; // maior que
//        var1 = 10 >= 10; // maior ou igual
//        var1 = 10 < 10; // menor que
//        var1 = 10 <= 10; // menor ou igual
//        var1 = 10 == 10; // igualdade
//        var1 = 10 != 10; // diferença
//
//        // operações lógicos - COMPARAÇÃO ENTRE VALORES BOOLEANOS
//        var1 = true && false; // true E false - SÓ VERDADE QUANDO AMBAS AS ENTRADAS SÃO VERDADE
//        var1 = true || false; // true OU false - SÓ FALSE QUANDO AMBAS AS ENTRADAS SÃO FALSE
//        var1 = !true; // NÃO false
//
//        // condicionais - estruturas de seleção
//        // if -> analisa uma condição e executar os determinados códigos
//        if (true) {
//            // se a condição for verdade executa esse trecho de código
//        } else {
//            // senão executa esse
//        }
//
//        // if aninhado
//        if (true) {
//            // se a condição for verdade executa esse trecho de código
//            if (var1) {
//            }
//
//            // if encadeado
//            if (true) {
//                // se a primeira condição for verdade executa esse trecho de código
//            } else if (var1 == 10) {
//                // senão se a segunda condição for verdade executa esse trecho de código
//            } else {
//                // senão executa esse
//            }
//
//            switch (var1) {
//                case 1:
//                    System.out.println("um");
//                    break;
//                case 2:
//                    System.out.println("dois");
//                    break;
//                case 3:
//                    System.out.println("três");
//                    break;
//                case 4:
//                    System.out.println("quatro");
//                    break;
//                case 5:
//                    System.out.println("cinco");
//                    break;
//                // se o valor não for igual a menhum caso; o padrão é executado
//                default:
//                    System.out.println("não sei");
//                    break;
//            }
//
//            // repetição
//            // for - irá repetir um trecho de código por um determinado número de vezes
//            // enquanto a condição for verdade
//            for (var1; var1 <= 10; var1++) {
//                // código repetido a cada iteração
//                System.out.println(i);
//            }
//
//            // while - irá repetir um trecho de código por um número de vezes desconhecido
//            // enquanto a condição for verdade
//            while (var1 != 0) {
//                System.out.println("teste");
//                var1 = in.nextInt(); // atualização da variável utilizada na condição do while, caso esse valor não seja atualizado
//                // irá gerar um loop infinito
//            }
//
//            // String
//            var3 = "Did you know about the aclaimed MMO FFXIV?"
//            System.out.println(var3.length()); // length () retorna a quantidade total de caracteres no teto
//
//            System.out.println(var3.charAt(0)); // charAt () retorna o caractere na posição x do texto
//
//            System.out.println(var3.equals("teste")); // equals () realiza comparação entre Strings
//
//            System.out.println(var3.toLowerCase()); // toLowerCase () converte todos os caracteres da String para minúsculo
//
//            System.out.println(var3.toUpperCase()); // toUpperCase () converte todos os caracteres da String para maiúsculo
//
//            System.out.println(var3.contains("FFXIV")); // contains () checa se o texto informado contém a String do parâmetro
//
//            System.out.println(var3.strip()); // strip () remove espaços do final e do começo do texto
//
//            System.out.println(var3.split(" ")); // split () irá quebrar o texto no delimitador informado informado e retornar
//            // uma lista dos textos
//
//            for (String word : splitted)

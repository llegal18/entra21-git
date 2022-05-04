import java.util.Scanner;
public class Exercicio {

    public static void main(String[] args) {
        exe10();
    }

    public static void exe01() {
        int varA = 10;
        int varB = 20;
        int varC = varA;
        varA = varB;
        varB = varC;
        System.out.println(varA);
        System.out.println(varB);
    }

    public static void exe02() {
        int var1 = 10;
        System.out.println(var1 - 1);
    }

    public static void exe022() {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int valor = in.nextInt();
        System.out.println(--valor);
    }

    public static void exe03() {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe a base do retângulo: ");
        double base = in.nextDouble();
        System.out.print("Informe a altura do retângulo: ");
        double altura = in.nextDouble();
        double area = base*altura;
        double perimetro = base*2 + altura*2;
        System.out.println("Área: "+area);
        System.out.println("Perímetro: "+perimetro);
    }

    public static void exe033() {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe a base do retângulo: ");
        double base = in.nextDouble();
        System.out.print("Informe a altura do retângulo: ");
        double altura = in.nextDouble();
        double area = base*altura;
        double perimetro = base*2 + altura*2;
        System.out.printf("Área: %.2f\n", area);
        System.out.printf("Perímetro: %.2f", perimetro);
    }

    public static void exe04() {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe sua idade em anos: ");
        int anos = in.nextInt();
        System.out.print("Informe quantos meses: ");
        int meses = in.nextInt();
        System.out.print("Informe quantos dias: ");
        int dias = in.nextInt();
        int total = anos*365 + meses*30 + dias;
        System.out.printf("Você viveu %d dias" ,total);
    }

    public static void exe05() {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe a quantidade total de eleitores: ");
        int eleitores = in.nextInt();
        System.out.print("Informe a quantidade de votos BRANCOS: ");
        int brancos = in.nextInt();
        System.out.print("Informe a quantidade de votos NULOS: ");
        int nulos = in.nextInt();
        int totalvalidos = eleitores - brancos - nulos;
        System.out.println("Total de votos válidos é: "+totalvalidos);
        double porcvalidos = (100.0*totalvalidos) / eleitores;
        double porcbrancos = (100.0*brancos) / eleitores;
        double porcnulos = (100.0*nulos) / eleitores;
        System.out.println("A porcentagem de votos validos é: "+porcvalidos+"%");
        System.out.println("A porcentagem de votos brancos é: "+porcbrancos+"%");
        System.out.println("A porcentagem de votos nulos é: "+porcnulos+"%");
    }

    public static void exe055() {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe a quantidade total de eleitores: ");
        int eleitores = in.nextInt();
        System.out.print("Informe a quantidade de votos BRANCOS: ");
        int brancos = in.nextInt();
        System.out.print("Informe a quantidade de votos NULOS: ");
        int nulos = in.nextInt();
        int totalvalidos = eleitores - brancos - nulos;
        System.out.println("Total de votos válidos é: "+totalvalidos);
        double porcvalidos = (100.0*totalvalidos) / eleitores;
        double porcbrancos = (100.0*brancos) / eleitores;
        double porcnulos = (100.0*nulos) / eleitores;
        System.out.printf("%% de votos validos é: %.2f%%\n", porcvalidos);
        System.out.printf("%% de votos brancos é: %.2f%%\n", porcbrancos);
        System.out.printf("%% de votos nulos é: %.2f%%\n", porcnulos);

    }

    public static void exe06() {
        Scanner in = new Scanner(System.in);
        System.out.print("Quanto o funcionário ganha por mês atualmente? R$");
        double salario = in.nextDouble();
        System.out.print("Qual seria o percentual de reajuste? ");
        double reajuste = in.nextDouble();
        double desconto = (salario*reajuste)/100;
        double novosalario = salario + desconto;
        System.out.printf("Novo salário do funcionário é: %.2f\n",novosalario);

    }

    public static void exe07() {
        Scanner in = new Scanner(System.in);
        System.out.print("Qual é o custo de fábrica do carro? ");
        double fabrica = in.nextDouble();
        double distribuidor = 28;
        double impostos = 45;
        double valorDistribuidor = fabrica*(distribuidor/100);
        double valorImpostos = fabrica*(impostos/100);
        double custoConsumidor = fabrica + valorDistribuidor + valorImpostos;
        System.out.printf("O custo final é: R$ %.2f\n", custoConsumidor);
    }

    public static void exe08() {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe seu salário fixo: ");
        double salFixo = in.nextDouble();
        System.out.print("Informe a quantidade de carros que foram vendidos: ");
        int carrosVendidos = in.nextInt();
        System.out.print("Informe a comissão fixa por cada carro vendido: ");
        double comFixa = in.nextDouble();
        System.out.print("Informe o valor total de suas vendas: ");
        double totalVendas = in.nextDouble();
        double valordoscarros = comFixa * carrosVendidos;
        double percentual = (totalVendas * 5) / 100;
        double salFinal = salFixo + valordoscarros + percentual;
        System.out.printf("O salário final é: R$ %.2f", salFinal);
    }

    public static void exe09() {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe a temperatura (F): ");
        double tempF = in.nextInt();
        double tempC = ((tempF-32)*5)/9;
        System.out.printf("A temperatura em Celsius é: %.2f", tempC);
    }

    public static void exe10() {
        Scanner in = new Scanner(System.in);
        System.out.print("A primeira nota é: ");
        double n1 = in.nextDouble();
        System.out.print("A segunda nota é: ");
        double n2 = in.nextDouble();
        System.out.print("A terceira nota é: ");
        double n3 = in.nextDouble();
        double mediaFinal = ((n1*2) + (n2*3) + (n3*5))/10;
        System.out.printf("Sua média final é: %.2f\n", mediaFinal);
    }


    }

import java.util.Scanner;
public class Exercicio {

    public static void main(String[] args) {
        exe04();
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
        System.out.print("Informe a quantidade de eleitores: ");
        int eleitores = in.nextInt();
        System.out.print("Informe a quantidade de votos brancos: ");
        int brancos = in.nextInt();
        System.out.println("Informe a quantidade de votos nulos: ");
        




    }



    }

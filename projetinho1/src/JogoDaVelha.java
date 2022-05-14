import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char[][] matriz = {{'-', '-', '-'}, {'-', '-', '-'}, {'-', '-', '-'}};
        int player = 1;
        char valor = 'O';
        int cont = 0;
        boolean vencedor = false;
        while (!vencedor) {
            cont = 0;
            if (player == 1) {
                System.out.print("Digite a posição da sua jogada Player 1 (O): ");
                valor = 'O';
            } else {
                System.out.print("Digite a posição da sua jogada Player 2 (X): ");
                valor = 'X';
            }
            int pos = in.nextInt();
            switch (pos) {
                case 1:
                    if (matriz[0][0] == '-') {
                        matriz[0][0] = valor;
                        break;
                    } else {
                        System.err.println("Digite uma posição livre.");
                        continue;
                    }
                case 2:
                    if (matriz[0][1] == '-') {
                        matriz[0][1] = valor;
                        break;
                    } else {
                        System.err.println("Digite uma posição livre.");
                        continue;
                    }
                case 3:
                    if (matriz[0][2] == '-') {
                        matriz[0][2] = valor;
                        break;
                    } else {
                        System.err.println("Digite uma posição livre.");
                        continue;
                    }
                case 4:
                    if (matriz[1][0] == '-') {
                        matriz[1][0] = valor;
                        break;
                    } else {
                        System.err.println("Digite uma posição livre.");
                        continue;
                    }
                case 5:
                    if (matriz[1][1] == '-') {
                        matriz[1][1] = valor;
                        break;
                    } else {
                        System.err.println("Digite uma posição livre.");
                        continue;
                    }
                case 6:
                    if (matriz[1][2] == '-') {
                        matriz[1][2] = valor;
                        break;
                    } else {
                        System.err.println("Digite uma posição livre.");
                        continue;
                    }
                case 7:
                    if (matriz[2][0] == '-') {
                        matriz[2][0] = valor;
                        break;
                    } else {
                        System.err.println("Digite uma posição livre.");
                        continue;
                    }
                case 8:
                    if (matriz[2][1] == '-') {
                        matriz[2][1] = valor;
                        break;
                    } else {
                        System.err.println("Digite uma posição livre.");
                        continue;
                    }
                case 9:
                    if (matriz[2][2] == '-') {
                        matriz[2][2] = valor;
                        break;
                    } else {
                        System.err.println("Digite uma posição livre.");
                        continue;
                    }
                default:
                    System.err.println("Digite um valor válido");
                    continue;
            }

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println("");
            }
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (matriz[i][j] == '-') {
                        cont += 1;
                    }
                }
            }

            if (matriz[0][0] == matriz[0][1] && matriz[0][0] == matriz[0][2] && matriz[0][0] != '-' ||
                    matriz[1][0] == matriz[1][1] && matriz[1][0] == matriz[1][2] && matriz[1][0] != '-' ||
                    matriz[2][0] == matriz[2][1] && matriz[2][0] == matriz[2][2] && matriz[2][0] != '-' ||
                    matriz[0][0] == matriz[1][0] && matriz[0][0] == matriz[2][0] && matriz[0][0] != '-' ||
                    matriz[0][1] == matriz[1][1] && matriz[0][1] == matriz[2][1] && matriz[0][1] != '-' ||
                    matriz[0][2] == matriz[1][2] && matriz[0][2] == matriz[2][2] && matriz[0][2] != '-' ||
                    matriz[0][0] == matriz[1][1] && matriz[0][0] == matriz[2][2] && matriz[0][0] != '-' ||
                    matriz[2][0] == matriz[1][1] && matriz[2][0] == matriz[0][2] && matriz[2][0] != '-') {
                System.err.println("O vencedor é o Player " + player + "!");
                vencedor = true;
            } else if (cont == 0) {
                System.err.println("O jogo deu velha!");
                vencedor = true;
            }

            if (player == 1) {
                player = 2;
            } else player = 1;
        }
    }
}

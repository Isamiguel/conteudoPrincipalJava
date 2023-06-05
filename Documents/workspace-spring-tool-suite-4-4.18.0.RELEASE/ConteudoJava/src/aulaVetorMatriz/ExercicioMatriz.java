package ExercicioVetor;

import java.util.Scanner;

public class ExercicioMatriz {

	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os numeros da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Numeros da Diagonal Principal:");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();

        System.out.println("Numeros da Diagonal Secundária:");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][2 - i] + " ");
        }
        System.out.println();

        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;
        for (int i = 0; i < 3; i++) {
            somaDiagonalPrincipal += matriz[i][i];
            somaDiagonalSecundaria += matriz[i][2 - i];
        }

        System.out.println("Soma da Diagonal Principal: " + somaDiagonalPrincipal);
        System.out.println("Soma da Diagonal Secundária: " + somaDiagonalSecundaria);
    }
}
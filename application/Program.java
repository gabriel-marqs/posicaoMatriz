package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe a quantidade de linhas da matriz: ");
		int n = sc.nextInt();
		System.out.print("Informe a quantidade de colunas da matriz: ");
		int m = sc.nextInt();

		int[][] mat = new int[n][m];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.print("Informe o valor para saber sua posição: ");
		int x = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {

					System.out.println("Posição " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Esquerda: " + mat[i][j - 1]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Direita: " + mat[i][j + 1]);
					}
					if (i > 0) {
						System.out.println("Cima: " + mat[i - 1][j]);
					}
					if (i < mat.length - 1) {
						System.out.println("Baixo: " + mat[i + 1][j]);
					}
					System.out.println();
				}
			}
		}

		sc.close();
	}

}

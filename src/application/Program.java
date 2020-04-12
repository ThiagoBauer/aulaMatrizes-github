package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int[][] mat;
		System.out.println("Qual o numero de linhas da matriz?");
		int linha = sc.nextInt();
		System.out.println("Qual o numero de colunas da matriz?");
		int coluna = sc.nextInt();

		mat = new int[linha][coluna];

		System.out.println("Digite os numeros que entrarao na matriz?");

		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < linha; i++) {

			System.out.println("coluna principal: " + mat[i][i]);
		}

		System.out.println("Qual valor voce busca?");

		int x = sc.nextInt();

		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position: " + i + "," + j);
					
					
					
					if (j > 0) {
						System.out.println("Esquerda: " + mat[i][j - 1]);
					} else {
						System.out.println("Nao tem numero a esquerda");
					}
					
					
					
					
					if (i > 0) {
						System.out.println("Acima: " + mat[i - 1][j]);

					} else {
						System.out.println("Nao tem numero acima");
					}
					
					
					
					
					
					if(j < mat[i].length-1) {
					System.out.println("Direita: " + mat[i][j + 1]);
					} 
					else {
						System.out.println("Nao tem numero a direita");
					}
					
					
					
					
					if(i < mat[i].length) {
					System.out.println("Abaixo: " + mat[i + 1][j]);
					}
					else {
						System.out.println("Nao tem numero abaixo");
					}
				}
			}
		}

		sc.close();
	}

}

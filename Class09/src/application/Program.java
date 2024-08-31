package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] matriz = new int[n][n];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal:");
		int soma = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					System.out.print(matriz[i][j] + " ");
				}
				if (matriz[i][j] < 0) {
					soma ++;
				}
			}
		}
	
		System.out.print("\nNegative numbers = " + soma);
		
		
		
		
		sc.close();

	}

}

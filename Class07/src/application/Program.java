package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.print("QUANTOS NUMEROS VOCE VAI DIGITAR? ");
		int n = input.nextInt();
		int[] vetor = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("DIGITE UM NUMERO: ");
			vetor[i] = input.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS:");
		for (int i=0; i<n; i++) {
			if (vetor[i] < 0) {
				System.out.println(vetor[i]);
			}
		}
		
		
		
		
		input.close();

	}

}

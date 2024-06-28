package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int saldoDepositado = n;
		
		int[] nota = {100, 50, 20, 10, 5, 2, 1};
		int[] quantDeNotas = new int[nota.length];
		
		for (int i = 0; i < nota.length; i++) {
			quantDeNotas[i] = n / nota[i];
			n = n % nota[i];
		}
		System.out.println(saldoDepositado);
		for (int i = 0; i < nota.length; i++) {
			System.out.printf("%d nota(s) de R$ %d,00%n", quantDeNotas[i], nota[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}

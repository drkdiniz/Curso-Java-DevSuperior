package exercicio04;

import java.util.Locale;
import java.util.Scanner;

public class Pares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = in.nextInt();
		
		int[] vect = new int[n];
		for (int i=0; i<vect.length; i++) {
		System.out.print("Digite um numero: ");
		vect[i] = in.nextInt();
		}
		
		System.out.println("\n\nNUMEROS PARES: ");
		int cont = 0;
		for (int i=0; i<vect.length; i++) {
			if (vect[i] % 2 == 0) {
				System.out.print(vect[i] +"  ");
				cont++;
			}
		}
		System.out.println("\n\nQUANTIDADE DE PARES = "+ cont);

		in.close();
	}

}

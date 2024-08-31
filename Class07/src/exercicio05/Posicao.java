package exercicio05;

import java.util.Locale;
import java.util.Scanner;

public class Posicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		
		double maior_valor = 0;
		int posicao_maior_valor = 0;
		for (int i=0; i<n; i++) {
			if (vect[i] > maior_valor) {
				maior_valor = vect[i];
				posicao_maior_valor = i + 1;
			}
		}
		System.out.println("\nMAIOR VALOR = " + maior_valor);
		System.out.println("POSICAO DO MAIOR VALOR = " + posicao_maior_valor);
		
		
		
		
		sc.close();
		
	}

}

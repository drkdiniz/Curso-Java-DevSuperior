package exercicio03;

import java.util.Locale;
import java.util.Scanner;

public class soma {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		System.out.print("quantos numeros você vai digitar? ");
		int n = in.nextInt();
		
		double[] vect = new double[n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = in.nextDouble();
		}
		System.out.print("VALORES = ");
		for (int i=0; i<vect.length; i++) {
			System.out.printf("%.1f  ", vect[i]);
		}
		
		double sum = 0;
		for (int i=0; i<vect.length; i++) {
			sum += vect[i];
		}
		System.out.printf("\nSOMA = %.2f%n", sum);
		
		double avg = sum / n;
		System.out.printf("MEDIA = %.2f%n", avg);
		
		
		in.close();

	}

}

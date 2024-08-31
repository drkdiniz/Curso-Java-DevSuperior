package exercicio07;

import java.util.Locale;
import java.util.Scanner;

public class Dados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		double[] altura = new double[n];
		String[] genero = new String[n];
		
		
		
		for (int i=0; i<n; i++) {
			System.out.printf("Altura da %dª pessoa: ", i+1);
			altura[i] = sc.nextDouble();
			System.out.printf("Genero da %dª pessoa: ", i+1);
			genero[i] = sc.next();
			
		}
		double sum =0.0;
		double maior_altura = altura[0];
		double menor_altura = altura[0];
		int homens = 0;
		int mulheres = 0;
		for (int i=0; i<n; i++) {
			if (altura[i] > maior_altura) {
				maior_altura = altura[i];
			}
			if (altura[i] < menor_altura) {
				menor_altura = altura[i];
			}
			if (genero[i].equalsIgnoreCase("m")) {
				homens++;
			}
			if (genero[i].equalsIgnoreCase("f")) {
				sum += altura[i];
				mulheres++;
				
			}
		}
		
		
		double avg = sum / mulheres;
		
		System.out.println("Menor altura = " + menor_altura);
		System.out.println("Maior altura = " + maior_altura);
		System.out.printf("Média das alturas das mulheres = %.2f%n", avg);
		System.out.println("Número de homens = " + homens);
		
		
		sc.close();

	
	}
}

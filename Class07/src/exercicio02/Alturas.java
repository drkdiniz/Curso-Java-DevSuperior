package exercicio02;

import java.util.Locale;
import java.util.Scanner;

import entities.Vetor;

public class Alturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = input.nextInt();
		Vetor[] pessoa = new Vetor[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("Dados da %dª pessoa: \n",i+1);
			input.nextLine();
			System.out.print("Nome: ");
			String nome = input.nextLine();
			System.out.print("Idade: ");
			int idade = input.nextInt();
			System.out.print("Altura: ");
			double altura = input.nextDouble();
			pessoa[i] = new Vetor(nome, idade, altura);	
		}
		double sum = 0;
		double sum16 = 0;
		for (int i=0; i<n; i++) {
			sum += pessoa[i].getAltura();
			if (pessoa[i].getIdade() < 16) {
				sum16++;
			}
		}
		double avg = sum / n;
		double avg16 = sum16 / n * 100;
		System.out.printf("Altura média: %.2f%n", avg);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", avg16);
		
		
		for (int i=0; i<n; i++) {
			if (pessoa[i].getIdade() < 16) {
				System.out.println(pessoa[i].getNome());
		}
		}	
		
		
		input.close();

	}
	}	



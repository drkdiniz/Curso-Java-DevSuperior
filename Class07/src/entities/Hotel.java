package entities;

import java.util.Locale;
import java.util.Scanner;

import desafio.Desafio;

public class Hotel {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a quantidade de hóspedes: ");
		int n = sc.nextInt();
		sc.nextLine();
		Desafio[] quarto = new Desafio[10];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Insira o nome do hospede: ");
			String nome = sc.nextLine();
			System.out.print("Insira o email do hospede: ");
			String email = sc.next();
			System.out.print("Escolha um dos quartos disponíveis: ");
			int aux = sc.nextInt();
			sc.nextLine();
			
			if (aux < 0 || aux > quarto.length) {
				System.out.println("Número do quarto inválido.");
                i--; 
			}
			else if (quarto[aux] != null) {
				System.out.println("O quarto já está ocupado!");
				i--;
			}
			else {
				quarto[aux] = new Desafio(nome, email);
				System.out.println("Hóspede adicionado ao quarto " + aux + " com sucesso!\n");
			}
		}
		System.out.println("Quartos ocupados: ");
		for (int i = 0; i < quarto.length; i++) {
			if (quarto[i] != null) {
				System.out.printf("Quarto %d: %s%n", i, quarto[i].toString());
			}
		}
			

		
		
		
		
		
		
		
		sc.close();
	}

}

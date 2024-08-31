package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Banco;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Account holder: ");
		String nome = sc.nextLine();
		
		Banco conta;
		
		System.out.print("Is there na initial deposity (y/n)? ");
		String deposity = sc.next();
		
		if (deposity.equalsIgnoreCase("y")) {
			System.out.print("Enter a initial value: ");
			double initialDeposit = sc.nextDouble();
			conta = new Banco(nome, initialDeposit);
			conta.imprimirSaldo();		
		}
		else {
			conta = new Banco(nome);
			conta.imprimirSaldo();	
		}
		System.out.print("Enter a deposit value:  ");
		conta.depositar(sc.nextDouble());
		conta.imprimirSaldo();
		
		System.out.print("Enter a Withdraw value: ");
		conta.sacar(sc.nextDouble());
		conta.imprimirSaldo();		
		
		sc.close();
		
	}

}

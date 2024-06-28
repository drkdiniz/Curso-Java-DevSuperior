package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException error) {
			System.out.println("Errou, seu burro.");
		}
		catch (InputMismatchException error) {
			System.out.println("Errou novamente, seu burro.");
		}
		System.out.println("Encerrando o programa.");
		
		
		sc.close();
	}

}

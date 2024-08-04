package beecrowd;

import java.util.Scanner;

public class Ddd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] cidade = {"Brasilia", "Salvador", "Sao Paulo", "Rio de Janeiro",
				"Juiz de Fora", "Campinas", "Vitoria", "Belo Horizonte"};
		
		int[] ddd = {61, 71, 11, 21, 32, 19, 27, 31};
		
		
		int n = sc.nextInt();
		boolean encontrada = false;
		
		for (int i = 0; i < cidade.length; i++) {
			if (ddd[i] == n) {
				System.out.println(cidade[i]);
				encontrada = true;
                break;
			}
			
		}
		if (!encontrada) {
            System.out.println("DDD nao cadastrado");	
		 }
	
		sc.close();
	}

}

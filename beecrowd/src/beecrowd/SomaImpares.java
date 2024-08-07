package beecrowd;

import java.util.Scanner;

public class SomaImpares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int sum = 0;
		
		if (x != y) {
			int inicio = Math.min(x, y);
			int fim = Math.max(x, y);
			
			for (int i = inicio + 1; i < fim; i++) {
				if (i % 2 != 0) {
					sum += i;
				}
			}
		}
		System.out.println(sum);
		sc.close();
	}

}

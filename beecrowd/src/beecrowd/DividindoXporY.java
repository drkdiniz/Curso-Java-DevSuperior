package beecrowd;

import java.util.Scanner;

public class DividindoXporY {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (y == 0) {
				System.out.println("divisao impossivel");
			}
			else {
				double divisao = (double) x / y;
				System.out.printf("%.1f", divisao);
			}
		}
		
		
		
		
		sc.close();

	}

}

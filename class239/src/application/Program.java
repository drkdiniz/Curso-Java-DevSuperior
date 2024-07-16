package application;

import java.util.Scanner;
import entities.PrintServicet;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	
		
		PrintServicet<Integer> ps = new PrintServicet<>();
		PrintServicet<String> ps1 = new PrintServicet<>();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int value = sc.nextInt();
			ps.addValue(value);
		}
		for (int i = 0; i < n; i++) {
			String value = sc.next();
			ps1.addValue(value);
		}
		
		ps.print();
		ps1.print();
		System.out.print("First: " + ps.first());
		System.out.print("First1: " + ps1.first());
		
		
		sc.close();

	}

}

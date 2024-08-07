package beecrowd;

import java.util.Scanner;

public class Animal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String a = sc.next();
		
		if (a.equalsIgnoreCase("vertebrado")) {
			String b = sc.next();
			if (b.equalsIgnoreCase("ave")) {
				String c = sc.next();
				if (c.equalsIgnoreCase("carnivoro")) {
					System.out.println("aguia");
				}
				else if (c.equalsIgnoreCase("onivoro")) {
					System.out.println("pomba");
				}
			}
			else if (b.equalsIgnoreCase("mamifero")){
				String c = sc.next();
				if (c.equalsIgnoreCase("onivoro")) {
					System.out.println("homem");
				}
				else if (c.equalsIgnoreCase("herbivoro")){
					System.out.println("vaca");
				}
			}
		}
		else if (a.equalsIgnoreCase("invertebrado")) {
			String b = sc.next();
			if (b.equalsIgnoreCase("inseto")) {
				String c = sc.next();
				if (c.equalsIgnoreCase("hematofago")) {
					System.out.println("pulga");
				}
				else if (c.equalsIgnoreCase("herbivoro")) {
					System.out.println("lagarta");
				}	
			}
			else if (b.equalsIgnoreCase("anelideo")){
				String c = sc.next();
				if (c.equalsIgnoreCase("hematofago")) {
					System.out.println("sanguessuga");
				}
				else if (c.equalsIgnoreCase("onivoro")){
					System.out.println("minhoca");
				}
			}
		}
		
		
		sc.close();
	}

}

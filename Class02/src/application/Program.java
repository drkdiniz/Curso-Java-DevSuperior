package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.print("Value of height: ");
		r.setHeight(input.nextDouble());
		
		System.out.print("Value of width: ");
		r.setWidth(input.nextDouble());
		
		System.out.println(r.toString());
		
		
		
		
		
		input.close();
	}

}

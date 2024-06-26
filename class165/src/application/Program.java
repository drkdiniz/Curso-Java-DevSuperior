package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Enum.Color;
import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.printf("Shape #%d data:\n", i);
			System.out.print("Rectangle or Circle (r/c)? ");
			String rc = sc.next();
			System.out.print("Color (BLACK/BLUE/RED): ");
			String colorChoice = sc.next().toUpperCase();
			Color color = Color.valueOf(colorChoice);
			
			if (rc.equalsIgnoreCase("r")) {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				list.add(new Rectangle(color, width, height));
			}
			else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
			}
			
			
		}
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for (Shape shape : list) {
			System.out.printf("%.2f%n", shape.area());
		}

		sc.close();
	}

}

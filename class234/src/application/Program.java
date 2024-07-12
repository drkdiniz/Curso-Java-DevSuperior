package application;


import devices.ComboDevice;
import devices.ConcretePrinter;
import devices.ConcreteScanner;

public class Program {

	public static void main(String[] args) {
		
		ConcretePrinter p = new ConcretePrinter("1080");
		p.processDoc("My Letter");
		p.print("My Letter");
		System.out.println();
		
		ConcreteScanner s = new ConcreteScanner("1081");
		s.processDoc("My email");
		System.out.println("Scan result: " + s.scan());
		System.out.println();
		
		ComboDevice c = new ComboDevice("1083");
		c.processDoc("My Letter 1");
		c.print("My Letter 1");
		System.out.println("Scan result: " + c.scan());
	}

}

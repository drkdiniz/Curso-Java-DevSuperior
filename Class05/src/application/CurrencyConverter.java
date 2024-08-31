package application;

public class CurrencyConverter {
	
	
	public static final double IOF = 6.0;
	
	
	public static double converterDollar(double dollar, double quant) {
		double valor = dollar * quant;
		return valor + (valor * IOF / 100);
		
		
	}
	
	
}

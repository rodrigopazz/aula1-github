package util;

public class CurrencyConverter {
	public static double iof = 1.06;
		
	public static double convert(double price, double reais) {
		return price * iof * reais;
	}

}

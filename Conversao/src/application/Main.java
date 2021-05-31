package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("What is the dollar price? ");
		double price = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		double reais = sc.nextDouble();
		double result = CurrencyConverter.convert(price, reais);
		System.out.printf("Amount to bepaid in reais = %.2f%n", result);
		
		sc.close();

	}

}

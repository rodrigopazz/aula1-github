package application;

import java.util.Locale;
import java.util.Scanner;

import entities.area;

public class rectangle {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		area area = new area();
		System.out.println("Enter rectangle width and height: ");
		area.width = sc.nextDouble();
		area.height = sc.nextDouble();
		
		System.out.println(area);
		
		
		sc.close();

	}

}

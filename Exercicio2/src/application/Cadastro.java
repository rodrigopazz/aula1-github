package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Cadastro {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee cadastro = new Employee();
		
		System.out.println("Digite os dados do funcionario: ");
		System.out.print("Name: ");
		cadastro.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		cadastro.gross_salary = sc.nextDouble();
		System.out.print("Tax: ");
		cadastro.tax = sc.nextDouble();
		
		System.out.print("Employee: " + cadastro);
		
		System.out.println();
		System.out.print("Which percentage to increase salary?");
		double percentage = sc.nextDouble();
		cadastro.increaseSalary(percentage);
				
		
		System.out.print("Updated: " + cadastro);
		
		sc.close();

	}

}

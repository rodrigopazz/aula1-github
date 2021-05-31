package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault (Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluno cadastro = new Aluno();
		
		System.out.print("Digite os dados do Aluno: ");
		System.out.print("Nome: ");
		cadastro.nome = sc.nextLine();
		cadastro.a = sc.nextDouble();
		cadastro.b = sc.nextDouble();
		cadastro.c = sc.nextDouble();
		
		System.out.printf("Final Grade: %.2f%n", cadastro.media());
		
		if(cadastro.media() < 60.00) {
			System.out.println("FAILED");
			System.out.printf("MISSING, %.2f POINTS%n", cadastro.resultado());
		}
		else {
			System.out.print("PASS");
		}
		
		sc.close();

	}

}

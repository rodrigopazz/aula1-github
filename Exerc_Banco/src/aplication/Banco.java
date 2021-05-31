package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Dados;

public class Banco {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Dados dados;
		
		System.out.println("Digite os dados Bancarios");
		System.out.print("Digite o nomero da Conta: ");
		int conta = sc.nextInt();
		
		System.out.print("Digite o nome do Cliente: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.println("O Cliente ira realizar um deposito? (y/n)");
		char resposta = sc.next().charAt(0);
		
		if( resposta == 'y' ) {
		System.out.print("Digite o Valor do deposito: ");
		double depositoInicial = sc.nextDouble();
		dados = new Dados(conta, name, depositoInicial);
		}
		else {
			dados = new Dados(conta, name);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(dados);
		
		System.out.println();
		System.out.print("Entre com o novo deposito");
		double maisDeposito = sc.nextDouble();
		dados.maisSaldo(maisDeposito);
		System.out.println("Updaded account data: ");
		System.out.print(dados);
		 
		System.out.println();
		System.out.print("Entre com o valor do saque");
		double menosSaldo = sc.nextDouble();
		dados.menosSaldo(menosSaldo);
		System.out.println("Updaded account data: ");
		System.out.print(dados);
		
		sc.close();

	}

}

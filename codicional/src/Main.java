import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x, y, z;
		
		System.out.println("Informe um valor: ");
		x = sc.nextInt();
		
		System.out.println("Informe outro valor: ");
		y =sc.nextInt();
		
		if(x > y ) {
			z = (24 - x) + y;
			System.out.printf("O JOGO DUROU %d HORAS", z);
		}
		else {
			if(y > x ) {
				z = y - x;
				System.out.printf("O JOGO DUROU %d HORAS", z);
			}
			else {
				System.out.println("O JOGO DUROU 24 HORA(S)");
			}
		}
		sc.close();

	}

}

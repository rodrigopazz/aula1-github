package entities;

public class Aluno {
	
	public String nome;
	public double a;
	public double b;
	public double c;
	
	public double media() {
		return a + b + c;
	}
	
	public double resultado() {
		if( media() < 60.0) {
			return 60.0 - media();
		}
		else {
			return 0.0;
		}
	}
	

}

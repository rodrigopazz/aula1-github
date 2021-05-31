package entities;

public class Dados {
	
	private int conta;
	private String name;
	private double deposito;
		
	public Dados(int conta, String name) {
		super();
		this.conta = conta;
		this.name = name;
	}
	double saldo;
	public Dados(int conta, String name, double deposito) {
		this.conta = conta;
		this.name = name;
		this.deposito = deposito;
		
	}
	public int getConta() {
		return conta;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDeposito() {
		return deposito;
	}
	
	public void maisSaldo(double deposito) {
		this.deposito += deposito;
		
	}
	
	public void menosSaldo(double deposito) {
		this.deposito -= deposito + 5.00;
	}
	
	public String toString() {
		return "Account "
				+ conta
				+", Holder: "
				+ name
				+ ", Balance: $ "
				+ String.format("%.2f", deposito);
	}
	
	

}


public class ContaBancaria {
	private int numeroConta;
	private double saldo;
	
	public ContaBancaria() {
		this.numeroConta = 0;
		this.saldo = 0.0;
		
	}
	
	public int getNumeroConta() {
		return(numeroConta);
	}
	public double getSaldo() {
		return(saldo);
	}
	
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}


public class Emprestimo {

	private double valor;
	private String dataE;
	private int numeroP;
	
	public Emprestimo() {
		this.valor = 0.0;
		this.dataE = "";
		this.numeroP = 0;
		
	}
	
	public Emprestimo(double valor, String dataE,int  numeroP) {
		
		this.valor = valor;
		this.dataE = dataE;
		this.numeroP = numeroP;
		
	}
	
	public double getValor() {
		return(valor);
	}
	public String getDataE() {
		return(dataE);
	}
	public int getNumeroP() {
		return(numeroP);
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	public void setDataE(String dataE) {
		this.dataE = dataE;
	}
	public void setNumeroP(int numeroP) {
		this.numeroP = numeroP;
	}
	
}

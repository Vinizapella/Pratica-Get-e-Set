public class Roda {
	private int aro;
	private double preco;
	private int qtd;
	private String marca;
	
	public Roda() {
		this.aro = 0;
		this.preco = 0.0;
		this.qtd = 0;
		this.marca = "";
	}
	
	public int getAro() {
		return(aro);
	}
	public double getPreco() {
		return(preco);
	}
	public int getQtd() {
		return(qtd);
	}
	public String getMarca() {
		return(marca);
	}
	
	public void setAro(int aro) {
		this.aro = aro;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
}

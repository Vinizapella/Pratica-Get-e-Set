public class Produto {
	private String nome;
	private Double preco;
	
	public Produto() {
		this.nome = "";
		this.preco = 0.0;
	}
	
	public String getNome() {
		
		return(nome);
		
	}
	
	public void setNome(String nome) {
		
		this.nome = nome;
		
	}
	
	public double getPreco() {
		
		return(preco);
		
	}
	
	public void setPreco(double preco) {
		
		this.preco = preco;
		
	}
	
}

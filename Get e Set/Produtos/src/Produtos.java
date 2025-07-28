public class Produtos {
	private String nome;
	private String descricao;
	private int qtd;
	
	public Produtos() {
		this.nome = "";
		this.descricao = "";
		this.qtd = 0;
		
	}
	
	public String getNome() {
		return(nome);
	}
	
	public String getDescricao() {
		return(descricao);
	}
	
	public int getQtd() {
		return(qtd);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
}

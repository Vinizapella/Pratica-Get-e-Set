public class Pessoa {
	private String nome;
	private int idade;
	
	public Pessoa() {
		this.nome = "";
		this.idade = 0;
	}
	
	public String getNome() {
		return(nome);
	}
	public int getIdade() {
		return(idade);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}

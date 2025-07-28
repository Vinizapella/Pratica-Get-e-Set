
public class Animal {

	private String nome;
	private String raca;
	private int idade;
	
	public Animal() {
		this.nome = "";
		this.raca = "";
		this.idade = 0;
		
	}
	
	public Animal(String nome, String raca, int idade) {
		
		this.nome = nome;
		this.idade = idade;
		this.raca = raca;
		
	}
	
	public String getNome() {
		return(nome);
	}
	public String getRaca() {
		return(raca);
	}
	public int getIdade() {
		return(idade);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}

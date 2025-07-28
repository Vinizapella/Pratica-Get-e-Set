
public class Aluno {

	private String nome;
	private int matricula;
	private double notaF;
	
	public Aluno() {
		this.nome = "";
		this.matricula = 0;
		this.notaF = 0.0;
		
	}
	
	public Aluno(String nome, int matricula, double notaF) {
		
		this.nome = nome;
		this.matricula = matricula;
		this.notaF = notaF;
		
	}
	
	public String getNome() {
		return(nome);
	}
	public int getMatricula() {
		return(matricula);
	}
	public double getNotaF() {
		return(notaF);
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public void setNotaF(double notaF) {
		this.notaF = notaF;
	}
}

public class Livro {

	private String autor;
	private String titulo;
	private int anoPublicacao;
	
	public Livro() {
		this.autor = "";
		this.titulo = "";
		this.anoPublicacao = 0;
		
	}
	
	public Livro(String autor, String titulo, int anoPublicacao) {
		this.autor = autor;
		this.titulo = titulo;
		this.anoPublicacao = anoPublicacao;
	}
	
	public String getAutor() {
		return(autor);
	}
	public String getTitulo() {
		return(titulo);
	}
	public int getAnoPublicacao() {
		return(anoPublicacao);
	}
	
	public void setAutor(String autor) {
		this.autor=autor;
	}
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao= anoPublicacao;
	}
	
}

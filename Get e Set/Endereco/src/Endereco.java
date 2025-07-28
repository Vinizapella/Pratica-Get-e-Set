
public class Endereco {

	private String rua;
	private int numero;
	private String cidade;
	
	public Endereco() {
		this.rua = "";
		this.numero = 0;
		this.cidade = "";
	}
	public Endereco(String rua, int numero, String cidade) {
		this.rua = rua;
		this.numero = numero;
		this.cidade = cidade;
	}
	
	public String getRua() {
		return(rua);
	}
	public int getNumero() {
		return(numero);
	}
	public String getCidade() {
		return(cidade);
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	public void setNumero(int numero) {
		this.numero=numero;
	}
	public void setCidade(String cidade) {
		this.cidade=cidade;
	}
}

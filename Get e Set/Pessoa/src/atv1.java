public class atv1 {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		
		pessoa1.setIdade(15);
		pessoa1.setNome("Victoria");
		
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getIdade());
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setIdade(17);
		pessoa2.setNome("Vinícius");
		
		System.out.println(pessoa2.getNome());
		System.out.println(pessoa2.getIdade());
	}
}


public class atv3 {

	public static void main(String[] args) {
		Livro livro1 = new Livro();
		Livro livro2 = new Livro();
		Livro livro3 = new Livro();
		
		livro1.setAutor("George Orwell");
		livro1.setTitulo("1984");
		livro1.setAnoPublicacao(1949);
		
		livro2.setAutor("Machado de Assis");
		livro2.setTitulo("Dom Casmurro");
		livro2.setAnoPublicacao(1899);
		
		livro3.setAutor("J.R.R. Tolkien");
		livro3.setTitulo("O Senhor dos Anéis");
		livro3.setAnoPublicacao(1954);
		
		System.out.println(livro1.getAutor());
		System.out.println(livro1.getTitulo());
		System.out.println(livro1.getAnoPublicacao());
		System.out.println(livro2.getAutor());
		System.out.println(livro2.getTitulo());
		System.out.println(livro2.getAnoPublicacao());
		System.out.println(livro3.getAutor());
		System.out.println(livro3.getTitulo());
		System.out.println(livro3.getAnoPublicacao());
		
	}

}

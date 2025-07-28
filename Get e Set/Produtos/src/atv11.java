public class atv11 {
	public static void main(String[] args) {
		Produtos produto1 = new Produtos();
		Produtos produto2 = new Produtos();
		Produtos produto3 = new Produtos();
		Produtos produto4 = new Produtos();
		
		produto1.setNome("Iphone");
		produto1.setDescricao("Usado");
		produto1.setQtd(5);
		produto2.setNome("Play 5");
		produto2.setDescricao("Novo, 0 Bala");
		produto2.setQtd(20);
		produto3.setNome("Bicicleta");
		produto3.setDescricao("Sem corrente");
		produto3.setQtd(1);
		produto4.setNome("Teclado");
		produto4.setDescricao("mecânico");
		produto4.setQtd(40);
		
		System.out.println(produto1.getNome());
		System.out.println(produto1.getDescricao());
		System.out.println(produto1.getQtd());
		System.out.println(produto2.getNome());
		System.out.println(produto2.getDescricao());
		System.out.println(produto2.getQtd());
		System.out.println(produto3.getNome());
		System.out.println(produto3.getDescricao());
		System.out.println(produto3.getQtd());
		System.out.println(produto4.getNome());
		System.out.println(produto4.getDescricao());
		System.out.println(produto4.getQtd());
	}
}


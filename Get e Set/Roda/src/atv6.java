public class atv6 {
	public static void main(String[] args) {
		Roda roda1 = new Roda();
		roda1.setAro(17);
		roda1.setPreco(350.0);
		roda1.setQtd(4);
		roda1.setMarca("Michelin");
		
		System.out.println(roda1.getAro());
		System.out.println(roda1.getPreco());
		System.out.println(roda1.getQtd());
		System.out.println(roda1.getMarca());
		
		Roda roda2 = new Roda();
		roda2.setAro(15);
		roda2.setPreco(200.0);
		roda2.setQtd(2);
		roda2.setMarca("Pirelli");
		
		System.out.println(roda2.getAro());
		System.out.println(roda2.getPreco());
		System.out.println(roda2.getQtd());
		System.out.println(roda2.getMarca());
		
		Roda roda3 = new Roda();
		roda3.setAro(16);
		roda3.setPreco(280.0);
		roda3.setQtd(4);
		roda3.setMarca("Goodyear");
		
		System.out.println(roda3.getAro());
		System.out.println(roda3.getPreco());
		System.out.println(roda3.getQtd());
		System.out.println(roda3.getMarca());
		
		Roda roda4 = new Roda();
		roda4.setAro(20);
		roda4.setPreco(250.0);
		roda4.setQtd(2);
		roda4.setMarca("Fiat");
		
		System.out.println(roda4.getAro());
		System.out.println(roda4.getPreco());
		System.out.println(roda4.getQtd());
		System.out.println(roda4.getMarca());
	}
}


public class atv2 {

	public static void main(String[] args) {
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();
		
		carro1.setMarca("Fusca");
		carro1.setModelo("121");
		carro1.setAno(1978);
		carro2.setMarca("Chevorlet");
		carro2.setModelo("Celta");
		carro2.setAno( 2007);
		carro3.setMarca("Ford");
		carro3.setModelo("Ka");
		carro3.setAno(2015);
		
		System.out.println(carro1.getMarca());
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getAno());
		System.out.println(carro2.getMarca());
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getAno());
		System.out.println(carro3.getMarca());
		System.out.println(carro3.getModelo());
		System.out.println(carro3.getAno());

	}

}

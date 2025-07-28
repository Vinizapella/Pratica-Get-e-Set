
public class atv8 {

	public static void main(String[] args) {
		Endereco endereco1 =  new Endereco();
		Endereco endereco2 =  new Endereco();
		Endereco endereco3 =  new Endereco();
		Endereco endereco4 =  new Endereco();
		
		endereco1.setRua("Aqui");
		endereco1.setNumero(1);
		endereco1.setCidade("Jaras");
		
		endereco2.setRua("Lá");
		endereco2.setNumero(11);
		endereco2.setCidade("Jaras");
		
		endereco3.setRua("Lá perto");
		endereco3.setNumero(111);
		endereco3.setCidade("Jaras");
		
		endereco4.setRua("Lá longe");
		endereco4.setNumero(1111);
		endereco4.setCidade("Jaras");
		
		System.out.println(endereco1.getRua());
		System.out.println(endereco1.getNumero());
		System.out.println(endereco1.getCidade());
		
		System.out.println(endereco2.getRua());
		System.out.println(endereco2.getNumero());
		System.out.println(endereco2.getCidade());
		
		System.out.println(endereco3.getRua());
		System.out.println(endereco3.getNumero());
		System.out.println(endereco3.getCidade());
		
		System.out.println(endereco4.getRua());
		System.out.println(endereco4.getNumero());
		System.out.println(endereco4.getCidade());
		
	}

}

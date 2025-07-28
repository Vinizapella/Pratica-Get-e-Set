
public class atv10 {

	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario();
		Funcionario funcionario2 = new Funcionario();
		Funcionario funcionario3 = new Funcionario();
		Funcionario funcionario4 = new Funcionario();
		
		funcionario1.setNome("Vic");
		funcionario1.setSalario(50000);
		funcionario1.setCargo("Chefe");
		
		funcionario2.setNome("Vini");
		funcionario2.setSalario(1800);
		funcionario2.setCargo("Subordinado");
		
		funcionario3.setNome("Ivone");
		funcionario3.setSalario(40000);
		funcionario3.setCargo("Chefe");
		
		funcionario4.setNome("Vanderlei");
		funcionario4.setSalario(10000);
		funcionario4.setCargo("Subordinado");
		
		System.out.println(funcionario1.getNome());
		System.out.println(funcionario1.getSalario());
		System.out.println(funcionario1.getCargo());
		
		System.out.println(funcionario2.getNome());
		System.out.println(funcionario2.getSalario());
		System.out.println(funcionario2.getCargo());
		
		System.out.println(funcionario3.getNome());
		System.out.println(funcionario3.getSalario());
		System.out.println(funcionario3.getCargo());
		
		System.out.println(funcionario4.getNome());
		System.out.println(funcionario4.getSalario());
		System.out.println(funcionario4.getCargo());


	}

}

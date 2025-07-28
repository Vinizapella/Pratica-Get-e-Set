public class Atv9 {
	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria();
		
		conta1.setNumeroConta(1010);
		conta1.setSaldo(0.25);
		
		ContaBancaria conta2 = new ContaBancaria();
		conta2.setNumeroConta(2222);
		conta2.setSaldo(12000);
		
		System.out.println(conta1.getNumeroConta());
		System.out.println(conta1.getSaldo());
		System.out.println(conta2.getNumeroConta());
		System.out.println(conta2.getSaldo());
		
	}
}



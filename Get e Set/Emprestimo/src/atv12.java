
public class atv12 {

	public static void main(String[] args) {
		Emprestimo emprestimo1 = new Emprestimo();
		Emprestimo emprestimo2 = new Emprestimo();
		Emprestimo emprestimo3 = new Emprestimo();
		Emprestimo emprestimo4 = new Emprestimo();
		
		emprestimo1.setValor(7);
		emprestimo1.setDataE("11/04/2-25");
		emprestimo1.setNumeroP(1);
		
		emprestimo2.setValor(77);
		emprestimo2.setDataE("09/06/2-27");
		emprestimo2.setNumeroP(10);
		
		emprestimo3.setValor(7777);
		emprestimo3.setDataE("01/01/2-26");
		emprestimo3.setNumeroP(12);
		
		emprestimo4.setValor(777777);
		emprestimo4.setDataE("19/06/2-26");
		emprestimo4.setNumeroP(1);
		
		System.out.println(emprestimo1.getValor());
		System.out.println(emprestimo1.getDataE());
		System.out.println(emprestimo1.getNumeroP());
		
		System.out.println(emprestimo2.getValor());
		System.out.println(emprestimo2.getDataE());
		System.out.println(emprestimo2.getNumeroP());
		
		System.out.println(emprestimo3.getValor());
		System.out.println(emprestimo3.getDataE());
		System.out.println(emprestimo3.getNumeroP());
		
		System.out.println(emprestimo4.getValor());
		System.out.println(emprestimo4.getDataE());
		System.out.println(emprestimo4.getNumeroP());
	}

}


public class atv12 {

	public static void main(String[] args) {
		Emprestimo emprestimo1 = new Emprestimo(7,"11/04/2-25",1);
		Emprestimo emprestimo2 = new Emprestimo(77,"09/06/2-27",10);
		Emprestimo emprestimo3 = new Emprestimo(7777,"01/01/2-26",12);
		Emprestimo emprestimo4 = new Emprestimo(777777,"19/06/2-26",11);
		
		System.out.println(emprestimo1.valor);
		System.out.println(emprestimo1.dataE);
		System.out.println(emprestimo1.numeroP);
		
		System.out.println(emprestimo2.valor);
		System.out.println(emprestimo2.dataE);
		System.out.println(emprestimo2.numeroP);
		
		System.out.println(emprestimo3.valor);
		System.out.println(emprestimo3.dataE);
		System.out.println(emprestimo3.numeroP);
		
		System.out.println(emprestimo4.valor);
		System.out.println(emprestimo4.dataE);
		System.out.println(emprestimo4.numeroP);
	}

}

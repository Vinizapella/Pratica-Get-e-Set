
public class atv4 {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		Aluno aluno4 = new Aluno();
		
		aluno1.setNome("Vini");
		aluno1.setMatricula(111);
		aluno1.setNotaF(8);
		aluno2.setNome("Vic");
		aluno2.setMatricula(222);
		aluno2.setNotaF(10);
		aluno3.setNome("João");
		aluno3.setMatricula(333);
		aluno3.setNotaF(7.4);
		aluno4.setNome("Bruno");
		aluno4.setMatricula(444);
		aluno4.setNotaF(10);
		
		
		
		System.out.println(aluno1.getNome());
		System.out.println(aluno1.getMatricula());
		System.out.println(aluno1.getNotaF());
		System.out.println(aluno2.getNome());
		System.out.println(aluno2.getMatricula());
		System.out.println(aluno2.getNotaF());
		System.out.println(aluno3.getNome());
		System.out.println(aluno3.getMatricula());
		System.out.println(aluno3.getNotaF());
		System.out.println(aluno4.getNome());
		System.out.println(aluno4.getMatricula());
		System.out.println(aluno4.getNotaF());


	}

}

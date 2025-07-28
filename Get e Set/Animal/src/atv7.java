
public class atv7 {

	public static void main(String[] args) {
		Animal animal1 = new Animal();
		Animal animal2 = new Animal();
		Animal animal3 = new Animal();
		Animal animal4 = new Animal(); 
		
		animal1.setNome("Bellinha");
		animal1.setRaca("Pinscher");
		animal1.setIdade(10);
		animal2.setNome("Pipoca");
		animal2.setRaca("Vira-Lata");
		animal2.setIdade(1);
		animal3.setNome("Luna");
		animal3.setRaca("Gato");
		animal3.setIdade(8);
		animal4.setNome("Bebê");
		animal4.setRaca("calopsita");
		animal4.setIdade(3);
				
				
				
		System.out.println(animal1.getNome());
		System.out.println(animal1.getRaca());
		System.out.println(animal1.getIdade());
		System.out.println(animal2.getNome());
		System.out.println(animal2.getRaca());
		System.out.println(animal2.getIdade());
		System.out.println(animal3.getNome());
		System.out.println(animal3.getRaca());
		System.out.println(animal3.getIdade());
		System.out.println(animal4.getNome());
		System.out.println(animal4.getRaca());
		System.out.println(animal4.getIdade());
	}

}

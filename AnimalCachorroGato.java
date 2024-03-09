package atividadessenai;

public abstract class Animal {
	
	private String animal;
	
	Animal (String animal){
		this.animal = animal;
	}

	public abstract void EmitirSom();
}

package atividadessenai;

public class Cachorro extends Animal{
	
	Cachorro (String nome){
		super(nome);
	}
	
	public void EmitirSom() {
		System.out.println("Au Au!!");
	}
}

package atividadessenai;

public class Gato  extends Animal{
	
	Gato ( String nome){
		super(nome);
	}
	
	public void EmitirSom() {
		System.out.println("Miau!!");
	}
}

package atividadessenai;

public class Geralzao {

		public static void main(String[] args) {
			Cachorro doguin = new Cachorro ("Bolt");
			doguin.EmitirSom();
			
			Gato gatin = new Gato("Snowbell");
			gatin.EmitirSom();
		}
}

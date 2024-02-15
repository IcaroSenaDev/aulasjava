package atividadessenai;
import java.util.ArrayList;

public class Usuario {
	
	private int id;
	private String nome;
	private String sobrenome;
	
	Usuario ( int id, String nome, String sobrenome){
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	@Override
	public String toString() {
		return "ID: " + id + " - Nome: " + nome + " - Sobrenome: " + sobrenome;
	}
	public static void main(String[] args) {
		ArrayList <String> Usuario = new ArrayList<>();
		
		Usuario.add("JV");
		Usuario.add("Renan");
		Usuario.add("Ryan");
		Usuario.add("Portales");
		Usuario.add("Sami");
		Usuario.add("Leandro");
		
		Usuario.remove(3);
		
		System.out.println(Usuario);
		
		System.out.print("\n");
		Usuario usuario = new Usuario(141,"Icaro","Sena");
		System.out.println(usuario.toString());
	}
}

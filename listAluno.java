package atividadessenai;
import java.util.ArrayList;
public class Aluno {
	private String nome;
	private int idade;
	private int matricula;
	
	Aluno (String nome, int idade, int matricula){
		this.nome = nome;
		this.idade = idade;
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public int getMatricula() {
		return matricula;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + " - Idade: " + idade + " - Matricula: " + matricula + "\n";
	}
	
	public static void main(String[] args) {
		ArrayList<Aluno> Aluno = new ArrayList<>();
		
		Aluno.add(new Aluno("Icaro", 17, 196508));
		Aluno.add(new Aluno("Ryan", 17, 196507));
		Aluno.add(new Aluno("Jv", 17, 194358));
		Aluno.add(new Aluno("Leandro", 32, 483432));
		Aluno.add(new Aluno("Renan", 18, 344324));
		
		Aluno.remove(3);
		
		System.out.println(Aluno.toString());
	}
}

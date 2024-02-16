package atividadesdosenai;

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
		
		System.out.println(Aluno.toString());

		int matriculaRemover = 196507;
        for (int i = 0; i < Aluno.size(); i++) {
            if (Aluno.get(i).getMatricula() == matriculaRemover) {
                Aluno.remove(i);
                break;
            }
        }
		
		System.out.println("\nALUNOS APÓS A REMOÇÃO DE UM MEMBRO DA LISTA PELA MATRICULA: " + "\n\n" + Aluno.toString());
	}
}

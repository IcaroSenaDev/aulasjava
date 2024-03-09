package atividadessenai;

public class Pessoa {
	private String nome;
	private int idade;
	
	Pessoa (String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade; 
	}
	
	public void setNome() {
		this.nome = nome;
	}
	
	public void setIdade() {
		this.idade = idade;
	}
	
	@Override
	
	public String toString() {
		return "Pessoa: " + nome + " Idade " + idade;
	}
}
//Desenvolva um programa em Java que contenha duas classes: Pessoa e Aluno.
//A classe Pessoa deve ter os atributos nome e idade, e a classe Aluno deve
//herdar de Pessoa e ter um atributo adicional, matrícula.

package atividadessenai;

public class Aluno extends Pessoa {

    private String matricula;

    Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno: " + "Matricula: " + matricula + " " + super.toString();
    }
}

package atividadessenai;

public class Geral{
	public static void main(String[] args) {
		
	        Pessoa pessoa = new Pessoa("João", 20);
	        System.out.println(pessoa);

	        Aluno aluno = new Aluno("Maria", 21, "123456");
	        System.out.println(aluno);
	}
}

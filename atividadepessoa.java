package atividadessenai;

public class Pessoa {
	private String nome;
	private int idade;
	private Double peso;
	private Double altura;
	
		Pessoa (String nome, int idade, Double peso, Double altura){
			this.nome = nome;
			this.idade = idade;
			this.peso = peso;
			this.altura = altura;
		}
		
		public String getNome(){
			return nome;
		}
		
		public int getIdade() {
			return idade;
		}
		public Double getPeso() {
			return peso;
		}
		public Double getAltura() {
			return altura;
		}
		
		public void envelhecer() {
			System.out.println("-------------- 1 ANO SE PASSOU --------------");
			idade = idade + 1;
			System.out.println("Agora " + nome + " tem: " + idade + " anos de idade");
		}
		
		public void engordar(Double novopeso) {
			peso += novopeso;
			System.out.println(nome + " ganhou alguns kilos, agora está pesando: " + peso);
		}
		
		public void emagrecer(Double pesomagro) {
			peso -= pesomagro;
			System.out.println(nome + " perdeu alguns kilos, agora está pesando: " + peso);
		}
	
		@Override
		public String toString() {
			return "Nome: " + nome + " - Idade: " + idade + " - Peso: " + peso + " - Altura: " + altura + "\n";
		}
		
		public void crescer() {
			if (idade >= 45) {
				altura -= 0.1;
				System.out.println("Devido a idade " + nome + " está diminuindo o seu tamanho, agora tem " + altura);
			} else if (idade < 21) {
				altura += 0.05;
				System.out.println("Devido a idade " + nome + " está aumentando o seu tamanho, agora tem " + altura);
			}
			
	}
		public static void main(String[] args) {
			Pessoa pessoa = new Pessoa("Icaro", 17, 61.2 ,1.73);
			
			System.out.println(pessoa.toString());
			
			pessoa.envelhecer();
			pessoa.engordar(20.3);
			pessoa.crescer();
		}
}

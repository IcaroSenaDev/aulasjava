package atividadessenai;

public abstract class Funcionario {
	private String nome;
	private int id;
	private Double salarioBase;
	public Funcionario(String nome, int id, Double salarioBase) {
		this.nome = nome;
		this.id = id;
		this.salarioBase = salarioBase;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public abstract void calcularSalario();
}

package atividadessenai;

public class Gerente extends Funcionario{
	
	private Double bonus;

	public Gerente(String nome, int id, Double salarioBase, Double bonus) {
		super(nome, id, salarioBase);
		this.bonus = bonus;
	}

	public Double getBonus() {
		return bonus;
	}

	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}
	
	public void calcularSalario() {
		Double salarioTotal = getSalarioBase() + bonus;
		System.out.println("O salário total do Gerente é de: " + salarioTotal);
	}
	
}

package atividadessenai;

public class Operario extends Funcionario{
	
	private int horasTrabalhadas;
	private Double valorHora;

	public Operario(String nome, int id, Double salarioBase, int horasTrabalhadas, Double valorHora) {
		super(nome, id, salarioBase);
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}	
	
	public void calcularSalario() {
		Double salarioTotal = getSalarioBase() + (horasTrabalhadas*valorHora);
		
		System.out.println("O salário total do Operario é de: " + salarioTotal);
	}
}

package atividadessenai;

public class Empresa {
	public static void main(String[] args) {
		Gerente gerente = new Gerente("Ícaro", 754, 1450.93, 300.0);
		Operario operario = new Operario("Sena", 755, 800.0, 80, 6.42);
		
		gerente.calcularSalario();
		operario.calcularSalario();
	}
}

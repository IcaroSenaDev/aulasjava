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
	
	public abstract double calcularSalario();
}

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
	
	public abstract double calcularSalario();
}

package atividadessenai;

public class Operario extends Funcionario{
	
	private int horasTrabalhadas;
	private int valorHora;

	public Operario(String nome, int id, Double salarioBase, int horasTrabalhadas, int valorHora) {
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

	public int getValorHora() {
		return valorHora;
	}

	public void setValorHora(int valorHora) {
		this.valorHora = valorHora;
	}	
	
	@Override
    public double calcularSalario() {
        return getSalarioBase() + (horasTrabalhadas * valorHora);
    }
}

package atividadessenai;

import java.util.Scanner;

public class Empresa {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Informe o nome do gerente:");
        String nomeGerente = scanner.nextLine();
		
		System.out.println("Informe o Id do Gerente: ");
		int idGerente = scanner.nextInt();
		
		System.out.println("Informe o salário base do Gerente: ");
		Double salarioGerente = scanner.nextDouble();
		
		System.out.println("Informe o bonus anual do Gerente: ");
		Double bonus = scanner.nextDouble();
		
		Gerente gerente = new Gerente (nomeGerente, idGerente, salarioGerente, bonus);
		
		System.out.println("Informe o nome do operário:");
        scanner.nextLine();
        String nomeOperario = scanner.nextLine();
		
		System.out.println("Informe o Id do Operario: ");
		int idOperario = scanner.nextInt();
		
		System.out.println("Informe o salario base do Operario: ");
		Double salarioOperario = scanner.nextDouble();
		
		System.out.println("Informe quantas horas trabalhadas o operario teve: ");
		int horastrabalhadas = scanner.nextInt();
		
		System.out.println("Informe quanto é o valor da hora na empresa: ");
		int horas = scanner.nextInt();
		
		Operario operario = new Operario (nomeOperario, idOperario, salarioOperario, horastrabalhadas, horas);
		
		System.out.println("Nome: " + gerente.getNome() + " seu salário é de: " + gerente.calcularSalario());
	     	System.out.println("Nome: " + operario.getNome() + " seu salário é de: " + operario.calcularSalario());
		
	}
}

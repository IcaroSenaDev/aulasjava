package atividadessenai;

public class ContaCorrente {
	private int numerodaconta;
	private String nomedotitular;
	private Double saldo;
	
	ContaCorrente (int numerodaconta, String nomedotitular, Double saldo){
		this.numerodaconta = numerodaconta;
		this.nomedotitular = nomedotitular;
		this.saldo = saldo;
	}
	
	public int getNumerodaconta() {
		return numerodaconta;
	}
	
	public String getNomedotitular() {
		return nomedotitular;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	public void depositar(Double valor) {
		System.out.println("DEPOSITO NO VALOR DE " + valor + " REALIZADO COM SUCESSO");
		saldo += valor;
	}
	
	public void sacar(Double valor) {
		if (saldo == 0.0) {
			System.out.println("SALDO INSUFICIENTE PARA SAQUE");
		}else if ( saldo > 0.0) {
			System.out.println("SAQUE NO VALOR DE " + valor + " REALIZADO COM SUCESSO");
			saldo -= valor;
		}
	}
	
	@Override
	public String toString() {
		return "Numero da conta: " + numerodaconta + " - Nome do Titular: " + nomedotitular + " - Saldo: " + saldo + "\n";
	}
	
	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente(43563324, "Ícaro", 0.00);
		
		System.out.println(conta.toString());
		
		conta.depositar(1578.00);
		System.out.println(conta.toString());
		
		conta.sacar(500.34);
		System.out.println(conta.toString());
	}
}

package atividadesdosenai;

public class ContaInvestimento {
	
	private int numerodaconta;
	private String nomedotitular;
	private Double saldo;
	private Double taxajuros;
	
	ContaInvestimento (int numerodaconta, String nomedotitular, Double saldo, Double taxajuros){
		this.numerodaconta = numerodaconta;
		this.nomedotitular = nomedotitular;
		this.saldo = saldo;
		this.taxajuros = taxajuros;
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
	
	public Double gettaxaJuros() {
		return taxajuros;
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
	
	public void adicionarJuros() {
		Double juros = saldo * (taxajuros / 100);
		saldo += juros;
	}
	
	@Override
	public String toString() {
		return "Numero da conta: " + numerodaconta + " - Nome do Titular: " + nomedotitular + " - Saldo: " + saldo + " - Juros: " + taxajuros + "\n";
	}
	
	public static void main(String[] args) {
		ContaInvestimento conta = new ContaInvestimento(43563324, "Ícaro", 1000.0, 10.0);
		
		System.out.println(conta.toString());
		
		conta.depositar(1578.00);
		System.out.println(conta.toString());
		
		conta.sacar(500.34);
		System.out.println(conta.toString());
		
		for (int i = 0; i < 5; i++) {
            conta.adicionarJuros();
        }

        System.out.println("SALDO APÓS APLICAR O JUROS 5X: " + conta.getSaldo());
	}
}

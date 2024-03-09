package atividadessenai;

public class Elevador {
	
	private int andaratual = 0;
	private int totalandares;
	private int capacidadedoelevador;
	private int pessoaspresentes = 0;
	
	Elevador (int totalandares, int capacidadedoelevador){
		
		this.totalandares = totalandares;
		this.capacidadedoelevador = capacidadedoelevador;
		
	}

	public int getAndaratual() {
		return andaratual;
	}

	public int getTotalandares() {
		return totalandares;
	}

	public void setTotalandares(int totalandares) {
		this.totalandares = totalandares;
	}

	public int getCapacidadedoelevador() {
		return capacidadedoelevador;
	}

	public void setCapacidadedoelevador(int capacidadedoelevador) {
		this.capacidadedoelevador = capacidadedoelevador;
	}
	
	public int getPessoaspresentes() {
		return pessoaspresentes;
	}

	public void Entrar() {
		
		if (pessoaspresentes > capacidadedoelevador) {
			System.out.println("Capacidade Máxima de Pessoas Atingida!!");
		} else {
			System.out.println("Entrou mais uma pessoa no Elevador");			
			pessoaspresentes++;
		}
		
	}
	
	public void Sair() {
		
		if (pessoaspresentes <= 0) {
			System.out.println("Não tem nenhuma pessoa no elevador!!");
		} else {
			System.out.println("Saiu uma pessoa do Elevador");
			pessoaspresentes--;
		}
	}
	
	public void Subir () {
		
		if (andaratual == totalandares) {
			System.out.println("Estamos no último andar!!");
		} else {
			System.out.println("Subindo mais um andar!!");
			andaratual++;
		}
	}
	
	public void Descer () {
		if (andaratual == 0) {
			System.out.println("Estamos no térreo!!");
		} else {
			System.out.println("Descendo mais um andar!!");
			andaratual--;
		}
	}
	
	@Override
    public String toString() {
        return "AndarAtual: " + andaratual + " - Pessoas Presentes: " + pessoaspresentes;
    }
	
	public static void main(String[] args) {
		Elevador elevador = new Elevador(5,5);
		
		elevador.Subir();
		
		elevador.Entrar();
		elevador.Entrar();
		elevador.Entrar();
		
		System.out.println(elevador.toString()); // ANDAR 1 - 3 PESSOAS
		
		elevador.Subir();
		elevador.Subir();
		
		elevador.Entrar();
		elevador.Entrar();
		elevador.Entrar(); // VAI ALERTAR A CAPACIDADE MAXIMA
		
		System.out.println(elevador.toString()); // ANDAR 3 - 5 PESSOAS ( CAPACIDADE ATINGIDA )
		
		elevador.Descer();
		
		elevador.Sair();
		elevador.Sair();
		elevador.Sair();
		
		System.out.println(elevador.toString()); // AMDAR 2 - 2 PESSOAS
		
		elevador.Descer();
		elevador.Descer();
		elevador.Descer(); // VAI ALERTAR QUE NÃO PODE MAIS DESCER POR ESTAR NO TERREO
		
		System.out.println(elevador.toString()); // ANDAR 0 ( TERREO ) - 2 PESSOAS
		
		elevador.Sair();
		elevador.Sair();
		elevador.Sair(); // ALERTAR QUE NÃO TEM NGM NO ELEVADOR
		
		elevador.Subir();
		elevador.Subir();
		elevador.Subir();
		elevador.Subir();
		elevador.Subir();
		elevador.Subir(); // ALERTAR QUE ESTÁ NO ULTIMO ANDAR, NÃO DAR PRA SUBIR MAIS
		
	}
	
}

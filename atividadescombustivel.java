package atividadesdosenai;

public class Carros {
	
	private int combustivel = 0;
	private int consumo;
	
		Carros (int combustivel, int consumo){
			this.combustivel = combustivel;
			this.consumo = consumo;
		}
		
		public int getCombustivel() {
			return combustivel;
		}
		
		public int getConsumo() {
			return consumo;
		}
		
		public void andar(Double distancia) {
			Double consumototal = distancia / consumo;
			if (combustivel >= consumototal) {
				combustivel -= consumototal;
				System.out.println("CARRO PERCERREU A DISTANCIA DE: " + distancia + " E SOBROU DE COMBUSTIVEL: " + combustivel);
			}else {
				System.out.println("O CARRO NÃO TEM COMBUSTIVEL SUFICIENTE PARA PERCORRER ESSA DISTÂNCIA. PARE EM UM POSTO DE COMBUSTIVEL E ABASTEÇA O CARRO!!");
			}
		}
		
		public void abastecer(Double quantidade) {
			combustivel += quantidade;
			System.out.println("ABASTECIMENTO REALIZADO COM SUCESSO!! O CARRO AGORA TEM: " + combustivel + " LITROS DE COMBUSTIVEL");
		}
		
		public static void main(String[] args) {
			Carros carro = new Carros(76,10);
			
			carro.andar(700.29);
			carro.abastecer(40.2);
		}
}

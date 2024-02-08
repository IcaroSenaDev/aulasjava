package atividadessenai;

import java.util.Scanner;
public class Vetor {
	
	private int[] vetor;
	
	public void preencher(int n) {
		vetor = new int[n]; //CRIANDO UM NOVO VETOR COM UM TAMANHO ESPECIFICO ( N )
		Scanner scanner = new Scanner (System.in); // OBTER OS DADOS DO TECLADO ( USUARIO )
		System.out.println("Digite os " + n + " números inteiros para preencher o vetor:");
		for (int  i = 0; i < n; i++) {
			vetor[i] = scanner.nextInt(); // LENDO AS INFORMAÇÕES DO TECLADO
		}
	}
	
	public int[] getVetor() {
		return vetor;
	}
}
 class Matriz{
		private int [][] matriz;
		
		public void preencher (int m, int n) {
			matriz = new int [m][n]; // CRIANDO UMA NOVA MATRIZ COM UM TAMANHO ESPECIFICO DE LINHAS E COLUNAS
			Scanner scanner = new Scanner (System.in); // OBTER OS DADOS DO TECLADO ( USUARIO )
			System.out.println("Digite os números inteiros para preencher a matriz:");
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					matriz[i][j] = scanner.nextInt(); // LENDO AS INFORMAÇÕES DO TECLADO
				}
			}
			
		}
		
		public int[][] getMatriz(){
			return matriz;
		}
		
		class Verificador{
			public boolean Par(int[] n) {
				return n % 2 == 0;
			}
		}
		public class Principal{
			public static void main(String[] args) {
				
				Scanner scanner = new Scanner (System.in);
					
				Vetor vetor = new Vetor();// CRIANDO O VETOR 
						System.out.println("Digite o tamanho do vetor: ");
							int Tamanhodovetor = scanner.nextInt(); // ATRIBUIU O TAMANHO DO VETOR
						vetor.preencher(Tamanhodovetor); // ADICIONOU O TAMANHO DO VETOR PARA O PREENCHER CORRESPONDENTE DO VETOR
						
						
				Matriz matriz = new Matriz(); // CRIANDO A MATRIZ
					
				System.out.println("Digite o tamanho da linha da matriz: ");
					int Tamanhodalinhamatriz = scanner.nextInt(); // ATRIBUIU O TAMANHO DA LINHA DA MATRIZ
					
					System.out.println("Digite o tamanho da coluna da matriz: ");
					int Tamanhodacolunamatriz = scanner.nextInt(); // ATRIBUIU O TAMANHO DA COLUNA DA MATRIZ
				matriz.preencher(Tamanhodalinhamatriz, Tamanhodacolunamatriz); // ADICIONOU O TAMANHO DA LINHA E DA COLUNA PARA O PREENCHER CORRESPONDENTE DA MATRIZ
				
				
				Verificador verificador = new Verificador(); // CRIANDO O VERIFICADOR
				
					System.out.println("RESULTADO PARA OS NUMEROS DO VETOR: ");
					int[] vetorNumeros = vetor.getVetor();
					
						for (int numero : vetorNumeros) { // VERIFICANDO SE OS NUMEROS DO VETOR É PAR OU NÃO
							System.out.println(numero + " É PAR? " + verificador.Par(numero));
						}
						
						System.out.println("\n RESULTADO PARA OS NUMEROS DA MATRIZ: ");
					int[][] matrizNumeros = matriz.getMatriz();
					
						for (int [] linha : matrizNumeros) {
							for (int [] numero : linha) {
								   System.out.println(numero + " é par? " + verificador.Par(numero));					
					}
				}
			}
		}
	}

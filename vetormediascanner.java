package listadeatividadesenai;
import java.util.Scanner;

public class Media {
		
		public static void main(String[] args) {
			Scanner scanner = new Scanner ( System.in );
			int soma = 0;
				
				System.out.println("DIGITE A QUANTIDADE DE NUMEROS QUE IRÁ CONSULTAR A MÉDIA: ");
				int qtdvetor = scanner.nextInt();
				
				int vetor[] = new int [qtdvetor];
				
				for (int i = 0; i < vetor.length; i++) {
					System.out.println("DIGITE UM NÚMERO: ");
					int numero = scanner.nextInt();
					
					soma = soma + numero;
				}
				
				soma = soma / vetor.length;
				System.out.println(soma);
		}
}

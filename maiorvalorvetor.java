package atividadesdosenai;
import java.util.Scanner;

public class maiorvalorvetor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner ( System.in );
		int maiornumero = 0;
			
			System.out.println("DIGITE A QUANTIDADE DE NUMEROS QUE IRÁ ADICIONAR EM SEU VETOR: ");
			int qtdvetor = scanner.nextInt();
			
			int vetor[] = new int [qtdvetor];
			
			for (int i = 0; i < vetor.length; i++) {
				System.out.println("DIGITE UM NÚMERO: ");
				int numero = scanner.nextInt();
				
				if (maiornumero < numero) {
					maiornumero = numero;
				}
			
		}	
			
			System.out.println("O MAIOR NÚMERO FORNECIDO PELO USUARIO É: " + maiornumero);
	}
}

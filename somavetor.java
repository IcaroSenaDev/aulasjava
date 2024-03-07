package listadeatividadesenai;

public class Soma {
	
	public static void main(String[] args) {
		int vetor[] = { 3, 5, 6, 3, 5};
		int soma = 0;
		
		for (int i = 0; i < vetor.length; i++ ) {
			soma = soma + vetor[i];
		}
		
		System.out.println(soma);
	}
}

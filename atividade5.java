package atividadessenai;

import java.util.Scanner;

public class numerosimparespositivos{
	public boolean Impar(int n) { // CRIANDO UMA VARIAVEL BOOLEANA PARA NUMEROS IMPARES OU PARES
		return n % 2 != 0;
	}
	
	public boolean Positivo (int n) { // CRIANDO UMA VARIAVEL BOOLEANA PARA NUMEROS POSITIVOS OU NEGATIVOS
		return n > 0;
	}
	
	public static void main(String[] args) {
			Scanner scanner = new Scanner (System.in);
			numerosimparespositivos numero = new numerosimparespositivos();
			
			System.out.println("DIGITE UM NÚMERO: ");
			int numero1 = scanner.nextInt(); //OBTENDO DADOS DO TECLADO ( USUARIO )
			
			if (numero.Impar(numero1)) {
				System.out.println("O NUMERO " + numero1 + " É IMPAR"); // DEVERÁ IMPRIMIR SE O NUMERO FOR IMPAR
			}else {
				System.out.println("O NUMERO" + numero1 + " NÃO É IMPAR"); // DEVERÁ IMPRIMIR SE O NUMERO FOR PAR
			}
			
			System.out.println("DIGITE OUTRO NÚMERO: ");
			int numero2 = scanner.nextInt(); // OBTENDO DADOS DO TECLADO ( USUARIO )
			
			if (numero.Positivo(numero2)) {
				System.out.println("O NUMERO " + numero2 + " É POSITIVO"); // DEVERÁ IMPRIMIR SE O NUMERO FOR POSITIVO
			}else {
				System.out.println("O NUMERO " + numero2 + " NÃO É POSITIVO"); // DEVERÁ IMPRIMIR SE O NUMERO FOR NEGATIVO
			}
	}
}


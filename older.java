import java.util.*;

public class older {

	public static void main(String[] args) {
		
		Scanner age = new Scanner(System.in);
		int maiorIdade = 0;
		
		System.out.println("How old are you?"); //PERGUNTANDO A IDADE
		maiorIdade = age.nextInt();// UM SCANF DA VIDA
		
		if (maiorIdade < 18) {
			System.out.println("You are underare"); //DEVERÁ IMPRIMIR QUE É MENOR DE IDADE
		}else if(maiorIdade >= 18) {
			System.out.println("You are of legal age"); // DEVERÁ IMPRIMIR QUE É MAIOR DE IDADE
		}

	}

}

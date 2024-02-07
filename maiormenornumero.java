import java.util.Scanner;

public class wholenumbers {
	
    public static void main(String[] args) {
       
    	Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];
        
        System.out.println("Enter a number: ");

     
        for (int i = 0; i < 5; i++) { // Criando o vetor
            numeros[i] = scanner.nextInt();
        }
        
        
        int maior = numeros[0]; // Armazenando o Maior número
        int menor = numeros[0]; // Armazenando o Menor número
        
        // Encontrando o maior e o menor número
        for (int i = 1; i < 5; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        
       
        System.out.println("O maior número é: " + maior); //IMPRIMINDO O MAIOR NUMERO
        System.out.println("O menor número é: " + menor); //IMPRIMINDO O MENOR NUMERO
        
        scanner.close();
    }
}

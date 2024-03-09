package atividadesdosenai;

import java.util.ArrayList;
import java.util.Scanner;

public class numerocontemlista {

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("DIGITE QUANTOS NÚMEROS DESEJA ADICIONAR NA LISTA: ");
        int qtdlista = scanner.nextInt();

        for (int i = 0; i < qtdlista; i++) {
            System.out.println("DIGITE UM NÚMERO:");
            int numero = scanner.nextInt();

            lista.add(numero);
        }
        
        System.out.println("QUE NUMERO VOCÊ DESEJA VERIFICAR? ");
        int numerolista = scanner.nextInt();
        
        if (lista.contains(numerolista)) {
        	System.out.println("O NUMERO " + numerolista + " ESTÁ NA LISTA");
        } else {
        	System.out.println("O NUMERO " + numerolista + " NÃO ESTÁ NA LISTA");
        }
        
        scanner.close();
        System.out.println("AQUI ESTÁ TODOS OS NÚMEROS DA LISTA " + lista);
    }
}

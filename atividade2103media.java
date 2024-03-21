package atividades21032;
import java.util.Scanner;

public class Media {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        int quantidade = 0;

        while (true) {
            System.out.print("Digite um número: ");

            try {
                int numero = scanner.nextInt();
                soma += numero;
                quantidade++;
            } catch (ArithmeticException e) {
                System.out.println("Erro: Valor inválido. Digite um número.");
                scanner.nextLine();
            }

            System.out.println("Deseja digitar outro número? (S/N) ");
            String continuar = scanner.nextLine();
            if (!continuar.equals("S") && !continuar.equals("SIM")) {
                break;
            }
        }

        if (quantidade > 0) {
            double media = soma / quantidade;
            System.out.println("A média dos números digitados é: " + media);
        } else {
            System.out.println("Nenhum número válido foi digitado.");
        }

        scanner.close();
    }
}

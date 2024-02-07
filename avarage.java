import java.util.Scanner;

public class avarage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sumOfGrade = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter the student's grade " + i + ": ");
            double grade = scanner.nextDouble();
            sumOfGrade += grade;
        }
        double avarage = sumOfGrade / 3;
        System.out.println("A média das notas é: " + avarage);
    }
}

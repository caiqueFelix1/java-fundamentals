package variables;

import java.util.Scanner;

public class AgeDifferenceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String GREETING = "Olá!";

        System.out.println(GREETING + "\n\nDigite o nome da pessoa mais velha: ");
        var firstName = scanner.nextLine();

        System.out.println("Agora digite a idade dela: ");
        var firstAge = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o nome da pessoa mais nova: ");
        var secondName = scanner.nextLine();

        System.out.println("Agora digite a idade da pessoa mais nova: ");
        var secondAge = scanner.nextInt();

        var result = firstAge - secondAge;

        System.out.printf("A diferença de idade entre %s e %s é de %d anos!",
                         firstName, secondName, result);

        scanner.close();
    }
}

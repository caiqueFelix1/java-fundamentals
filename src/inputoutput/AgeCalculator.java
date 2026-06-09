package inputoutput;

import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bom dia! \n" +
                "Por favor, informe seu nome: ");
        var name = scanner.nextLine();

        System.out.println("Agora informe o ano do seu nascimento: ");
        var yearBorn = scanner.nextInt();

        var actualYear = java.time.Year.now().getValue();

        var age = actualYear - yearBorn;

        System.out.printf("\nOlá %s, você tem %d anos!", name, age);

        scanner.close();
    }
}

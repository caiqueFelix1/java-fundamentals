package mathoperations;

import java.util.Scanner;

public class SquareAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String GREETING = "Olá!";

        System.out.println(GREETING + "\nDigite o tamanho do lado do quadrado (em metros): ");
        var side = scanner.nextDouble();

        var result = side * side;
        System.out.println(result);
    }
}

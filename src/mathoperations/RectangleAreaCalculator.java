package mathoperations;

import java.util.Scanner;

public class RectangleAreaCalculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro lado a ser calculado: ");
        double firstSide = scanner.nextDouble();

        System.out.println("Digite o segundo lado a ser calculado: ");
        double secondSide =  scanner.nextDouble();

        double area = firstSide * secondSide;

        System.out.printf("A área do retângulo é: %.2f", area);

        scanner.close();
    }
}

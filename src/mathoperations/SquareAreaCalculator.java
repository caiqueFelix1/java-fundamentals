package mathoperations;

import model.Square;
import service.InputValidationService;
import service.SquareAreaCalculatorService;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SquareAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        InputValidationService inputValidationService = new InputValidationService();

        Square square = new Square();

        SquareAreaCalculatorService squareAreaCalculatorService = new SquareAreaCalculatorService();

        final String GREETING = "Olá!";

        while (true){
            try {
                square.setSide(
                        inputValidationService.readDouble(
                                scanner,
                                GREETING + "\nDigite o tamanho do lado do quadrado (em metros): "
                        )

                );
                break;
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Sua área total é de " + squareAreaCalculatorService.calculateSquareArea(square.getSide()));

        scanner.close();
    }
}

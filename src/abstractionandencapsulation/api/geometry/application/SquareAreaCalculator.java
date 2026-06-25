package abstractionandencapsulation.api.geometry.application;

import abstractionandencapsulation.api.geometry.model.Square;
import abstractionandencapsulation.api.geometry.service.InputValidationService;
import abstractionandencapsulation.api.geometry.service.SquareAreaCalculatorService;

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

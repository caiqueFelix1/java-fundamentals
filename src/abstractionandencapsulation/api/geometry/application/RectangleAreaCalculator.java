package abstractionandencapsulation.api.geometry.application;

import abstractionandencapsulation.api.geometry.model.Rectangle;
import abstractionandencapsulation.api.geometry.service.InputValidationService;
import abstractionandencapsulation.api.geometry.service.RectangleAreaService;

import java.util.Scanner;

public class RectangleAreaCalculator {
    static void main(String[] args) {

        RectangleAreaService rectangleAreaService = new RectangleAreaService();

        InputValidationService inputValidationService = new InputValidationService();

        Scanner scanner = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        while (true) {
            try {
                rectangle.setWidth(
                        inputValidationService.readDouble(
                                scanner,
                                "Digite a largura (Width): "
                        )
                );

                break;

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {

            try {
                rectangle.setHeight(
                        inputValidationService.readDouble(
                                scanner,
                                "Digite a altura (Height): "
                        )
                );

                break;

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        double area = rectangleAreaService.calculateArea(rectangle.getWidth(), rectangle.getHeight());

        System.out.printf("A área do retângulo é: %.2f", area);

        scanner.close();
    }
}

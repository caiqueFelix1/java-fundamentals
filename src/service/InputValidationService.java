package service;

import java.util.Scanner;

public class InputValidationService {
    public double readDouble(Scanner scanner, String message){
        while (true){
            System.out.println(message);

            String input = scanner.nextLine().trim();

            input = input.replace(",", ".");

            try{

                return Double.parseDouble(input);

            } catch (NumberFormatException e){
                System.out.println(
                        "Valor inválido. Digite um número válido!"
                );
            }
        }
    }
}

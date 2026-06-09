package inputoutput;

import model.Person;
import service.AgeCalculatorService;

import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();
        AgeCalculatorService ageCalculatorService = new AgeCalculatorService();
        boolean validName = false;
        boolean validBirthDate = false;

        System.out.println("Olá!");

        while (!validName) {
            System.out.println("Informe seu nome: ");

            try {
                person.setName(scanner.nextLine());
                validName = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        while(!validBirthDate) {
            System.out.println("Agora informe o ano do seu nascimento: ");

            try {
                String input = scanner.nextLine().trim();

                if (input.isEmpty()) {
                    throw new IllegalArgumentException("O ano digitado não pode ser vazio!");
                }

                int year = Integer.parseInt(input);

                person.setBirthDate(year);
                validBirthDate = true;

            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }

        int age = ageCalculatorService.calculate(person);

        System.out.printf("\nOlá %s, você tem %d anos!", person.getName(), age);

        scanner.close();
    }
}

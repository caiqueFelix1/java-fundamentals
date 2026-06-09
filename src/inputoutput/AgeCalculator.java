package inputoutput;

import model.Person;
import service.AgeCalculatorService;

import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();
        AgeCalculatorService ageCalculatorService = new AgeCalculatorService();

        System.out.println("Bom dia! \n" +
                "Por favor, informe seu nome: ");
        person.setName(scanner.nextLine());

        System.out.println("Agora informe o ano do seu nascimento: ");
        person.setYearBorn(scanner.nextInt());

        int age = ageCalculatorService.calculate(person);

        System.out.printf("\nOlá %s, você tem %d anos!", person.getName(), age);

        scanner.close();
    }
}

package abstractionandencapsulation.api.age.application;

import abstractionandencapsulation.api.age.model.PersonAge;
import abstractionandencapsulation.api.age.service.AgeDifferenceCalculatorService;

import java.util.Scanner;

public class AgeDifferenceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AgeDifferenceCalculatorService ageDifferenceCalculatorService = new AgeDifferenceCalculatorService();

        final String GREETING = "Olá!";

        System.out.println(GREETING);

        PersonAge firstPerson = createPerson(scanner, "Pessoa 1");
        PersonAge secondPerson = createPerson(scanner, "Pessoa 2");

        var result = ageDifferenceCalculatorService.differenceCalculator(firstPerson.getAge(), secondPerson.getAge());

        System.out.printf("A diferença de idade entre %s e %s é de %d anos!", firstPerson.getName(), secondPerson.getName(), result);

        scanner.close();
    }

    private static PersonAge createPerson(Scanner scanner, String label) {
        PersonAge person = new PersonAge();

        while (true) {
            try {
                System.out.printf("\n%s\nDigite o nome: ", label);
                person.setName(scanner.nextLine());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.println("Digite a idade: ");
                String inputValue = scanner.nextLine();
                person.setAge(Integer.parseInt(inputValue));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite apenas números inteiros: ");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return person;
    }
}
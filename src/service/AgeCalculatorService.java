package service;

import model.Person;

import java.time.LocalDate;

public class AgeCalculatorService {
    public int calculate (Person person){

        LocalDate dateToday = LocalDate.now();
        int currentYear = dateToday.getYear();

        return currentYear- person.getBirthDate();
    }
}

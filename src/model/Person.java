package model;

import java.time.Year;

public class Person {

    private String name;
    private int birthDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.trim().length()>=2) {
            this.name = name;
        } else {
            throw new IllegalArgumentException(
                    "Nome vazio ou com menos de dois caracteres, por favor tente novamente!"
            );
        }
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int yearBorn) {
        final int MIN_YEAR_ALLOWED = 1900;
        int currentYear = Year.now().getValue();

        if (yearBorn>=MIN_YEAR_ALLOWED && yearBorn<=currentYear) {
            this.birthDate = yearBorn;
        } else {
            throw new IllegalArgumentException(
              "A data não pode ser menor que 1900 e não pode ser maior que o ano atual, tente novamente!"
            );
        }
    }
}

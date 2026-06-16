package service;

import model.PersonAge;

public class AgeDifferenceCalculatorService {
    public int differenceCalculator(Integer firstPersonAge, Integer secondPersonAge){
        return Math.abs(firstPersonAge - secondPersonAge);
    }
}

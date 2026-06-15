package model;

public class Square {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side>=1){
            this.side = side;
        } else {
            throw new IllegalArgumentException(
                    "Por favor! Digite um número maior que 1: "
            );
        }
    }
}

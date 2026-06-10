package model;

public class Rectangle {
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width>=1) {
            this.width = width;
        } else {
            throw new IllegalArgumentException(
                    "Por favor! Digitar um número maior que 1: "
            );
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height>=1) {
            this.height = height;
        } else {
            throw new IllegalArgumentException(
                    "Por favor! Digitar um número maior que 1: "
            );
        }
    }
}

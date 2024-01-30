package Figure;

public class Triangle implements Perimetr {
    String name;
    double sideA;
    double sideB;
    double sideC;
    String color;
    String borderColor;

    Triangle(String name, int sideA, int sideB, int sideC, String color, String borderColor) {
        this.name = name;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.color = color;
        this.borderColor = borderColor;


    }


    @Override
    public double calculateSquare() {

        double p = (sideA + sideB + sideC) / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));

    }

    @Override
    public void colorF() {
        System.out.println("у треугольника цвет заливки " + color);
    }

    @Override
    public void borderColor() {
        System.out.println("у треугольника " + borderColor + " цвет границы");
    }
}
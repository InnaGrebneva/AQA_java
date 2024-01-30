package Figure;

public class Rectangle implements Perimetr {
    String name;
    int sideA;
    int sideB;
    String color;
    String borderColor;

    Rectangle(String name, int sideA, int sideB, String color, String borderColor) {
        this.name = name;
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = color;
        this.borderColor = borderColor;
    }

    @Override
    public double calculateSquare() {
        double S = sideA * sideB;
        System.out.println("Площадь прямоугольника " + S);
        return 0;
    }

    @Override
    public void colorF() {
        System.out.println("у прямоугольника цвет заливки " + color);
    }

    @Override
    public void borderColor() {
        System.out.println("у прямоугольника " + borderColor + " цвет границы");
    }


}












package Figure;

public class Circle implements Perimetr {
    String name;
    double radius;
    String color;
    String borderColor;

    public Circle(String name, double radius, String color, String borderColor) {
        this.name = name;
        this.radius = radius;
        this.color = color;
        this.borderColor = borderColor;
    }


    //@Override
//    public double calculatePerimeter() {
//        double P1;
//        double Pi = 3.1415;
//        P1 = 2 * Pi * radius;
//        System.out.println("Перимет круга " + P1);
//        return 0;
//    }

    @Override
    public double calculateSquare() {
        return 2 * radius * radius;
    }

    @Override
    public void colorF() {
        System.out.println("у круга цвет заливки " + color);
    }

    @Override
    public void borderColor() {
        System.out.println("у круга " + borderColor + " цвет границы");
    }
}
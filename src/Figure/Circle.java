package Figure;

public class Circle implements Perimetr {
     String name;
     double radius;
    private String color;
    private String borderColor;

    public Circle(String name, double radius, String color, String borderColor) {
        this.name = name;
        this.radius = radius;
        this.color = color;
        this.borderColor = borderColor;
    }

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
package Figure;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("прямоугольник", 5, 3, "голубой", "серый");
        System.out.println("Фигура - " + rectangle.name + "; ");

        System.out.println("Периметр прямоугольника "+rectangle.calculatePerimeterRectangle(rectangle));

        rectangle.calculateSquare();
        rectangle.colorF();
        rectangle.borderColor();

        Circle circle=new Circle("Круг", 3.5, "красный","черный");
        System.out.println("Фигура - " + circle.name + "; ");
        System.out.println("Перимет круга " +circle.calculatePerimeterCircle(circle));
        circle.calculateSquare();
        System.out.println("Площадь круга " + circle.calculateSquare());
        circle.colorF();
        circle.borderColor();

        Triangle triangle = new Triangle("Треугольник", 8, 3, 9,"синий", "зеленый");
        System.out.println("Фигура - " + triangle.name + "; ");
        System.out.println( "Периметр треугольника = " +triangle.calculatePerimeterTriangle(triangle));
        System.out.println("Площадь треугольника = "+triangle.calculateSquare());
        triangle.colorF();
        triangle.borderColor();
    }
}

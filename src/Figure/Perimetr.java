package Figure;

public interface Perimetr {

    double calculateSquare();

    void colorF();

    void borderColor();

    default double calculatePerimeterCircle(Circle circle) {
        double Pi = 3.1415;
        return 2 * Pi * circle.radius;
    }

    default double calculatePerimeterRectangle(Rectangle rectangle) {
        return 2 * (rectangle.sideA + rectangle.sideB);
    }

    default double calculatePerimeterTriangle(Triangle triangle) {
        return triangle.sideA + triangle.sideB + triangle.sideC;
    }


}

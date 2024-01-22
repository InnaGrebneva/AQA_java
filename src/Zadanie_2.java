public class Zadanie_2 {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = -50;
        int b = 10;
        if (a + b >= 0) {
            System.out.println("����� �������������");
        } else System.out.println("����� �������������");
    }

    public static void printColor() {
        int value = 106;
        if (value <= 0) {
            System.out.println("�������");

        } else if (value > 0 && value <= 100) {
            System.out.println("������");
        } else {
            System.out.println("�������");
        }
    }

    public static void compareNumbers() {
        int a = 0;
        int b = 15;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
}

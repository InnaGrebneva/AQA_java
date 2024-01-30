package Animals;

public class Dog extends Animal {
    private String name;
    private static int count;

    Dog(String name) {
        this.name = name;
        count++;
    }

    public static void count() {
        System.out.println("Создано собак: " + count);
    }

    public void run(int barrierLength) {
        if (barrierLength >= 500 && barrierLength < 0)
            System.out.println(name + " пробежал " + barrierLength + " метров");
        else System.out.println(name + " не может пробежать " + barrierLength + " метров");
    }

    public void swim(int barrierLength) {
        if (barrierLength <= 10 && barrierLength > 0)
            System.out.println(name + " проплыл " + barrierLength + " метров");
        else System.out.println(name + " не может проплыть " + barrierLength + " метров");
    }


}
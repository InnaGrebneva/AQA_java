package Animals;

public class Dog extends Animal {
     static int count;

    Dog(String name) {
        this.name = name;
            count++;
            super.maxRun=500;
            super.maxSwim=10;
    }

    public static void count() {
        System.out.println("Создано собак: " + count);
    }

    public void run(int barrierLength) {
        if (barrierLength <= super.maxRun && barrierLength > 0)
            System.out.println(super.name + " пробежал " + barrierLength + " метров");
        else System.out.println(super.name + " не может пробежать " + barrierLength + " метров");
    }

    public void swim(int barrierLength) {
        if (barrierLength <= super.maxSwim && barrierLength > 0)
            System.out.println(super.name + " проплыл " + barrierLength + " метров");
        else System.out.println(super.name + " не может проплыть " + barrierLength + " метров");
    }


}
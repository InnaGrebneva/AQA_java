package Animals;

public class Cat extends Animal {
    String name;
    static int count;
    boolean satiety = false;

    Cat(String name) {
        this.name = name;
        count++;
    }

    public static void count() {
        System.out.println("Создано котов " + count);
    }

    public void run(int barrierLength) {
        if (barrierLength <= 200 && barrierLength >= 0)
            System.out.println(this.name + " пробежал " + barrierLength + " метров");
        else
            System.out.println(this.name + " не может пробежать " + barrierLength + " метров");
    }

    public void swim(int barrierLength) {
        System.out.println("Кот не умеет плавать!!!");
    }

    public void eat(int food, Plate plate) {
        if (food > 0 && food < plate.food) {
            plate.food = plate.food - food;
            this.satiety = true;
            System.out.println("Кот " +name+ " покушал, его сытость: " +satiety);

        } else {
            this.satiety = false;
            System.out.println("Кот " +name+ " не может съесть " + food + " еды, его сытость: " +satiety);
        }
    }
}





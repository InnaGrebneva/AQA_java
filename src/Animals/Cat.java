package Animals;

public class Cat extends Animal {
    static int count;
    private boolean satiety;

    Cat(String name) {
        this.name = name;
        count++;
        super.maxRun = 200;
    }

    public static void count() {
        System.out.println("Создано котов " + count);
    }

    public void run(int barrierLength) {
        if (barrierLength <= super.maxRun && barrierLength > 0)
            System.out.println(super.name + " пробежал " + barrierLength + " метров");
        else
            System.out.println(super.name + " не может пробежать " + barrierLength + " метров");
    }

    public void swim(int barrierLength) {
        System.out.println("Кот не умеет плавать!!!");
    }

    public void eat(int food, Plate plate) {
        if (food > 0 && food <= plate.getFood()) {
            plate.dropFood(food);
            satiety = true;
            System.out.println("Кот " + super.name + " покушал, его сытость: " + satiety);

        } else {
            satiety = false;
            System.out.println("Кот " + super.name + " не может съесть " + food + " еды, его сытость: " + satiety);
        }
    }
}





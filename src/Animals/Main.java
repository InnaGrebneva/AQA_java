package Animals;

public class Main {
    public static void main(String[] args) {
        Cat catBarsik = new Cat("Барсик");
        Cat catMasha = new Cat("Маша");

        catBarsik.run(-200);
        catMasha.run(150);

        catBarsik.swim(200);

        Cat.count();

        Plate plate = new Plate();
        plate.addFood(20);

        Cat[] cat = new Cat[2];
        cat[0] = new Cat("Жорик");
        cat[1] = new Cat("Борис");
        for (Cat i : cat) {
                    i.eat(10, plate);
            System.out.println("Остаток еды в тарелке " + plate.getFood());
        }


        Dog dogSharik = new Dog("Шарик");
        Dog dogBobik = new Dog("Бобик");
        Dog dogTobik = new Dog("Тобик");
        dogSharik.run(600);
        dogBobik.run(200);
        dogTobik.run(-100);
        dogSharik.swim(5);
        dogBobik.swim(-6);
        dogTobik.swim(12);

        Dog.count();


        // System.out.println(dogSharik.name);
        //  System.out.println(dogBBB.name);
        Animal.getCount();
    }
}


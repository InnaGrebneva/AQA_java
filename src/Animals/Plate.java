package Animals;

public class Plate {
    int food;

    public void addFood(int food) {
        if (food > 0) {
            this.food = food + this.food;
            System.out.println("В тарелку добавлено " + food + " еды");
        }
    }


}

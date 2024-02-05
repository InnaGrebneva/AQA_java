package Animals;

public class Plate {
    private int food;

    public void dropFood(int food) {
        if (food > 0 && this.food > 0) {
            this.food = this.food - food;
        }
    }


    public void addFood(int food) {
        if (food > 0) {
            this.food = food + this.food;
            System.out.println("В тарелку добавлено " + food + " еды");
        }
    }

    public int getFood() {
        return this.food;
    }
}


package Animals;

public class Animal {
    String name;
    int maxRun;
    int maxSwim;
   static int count;
    Animal(){
        count++;
    }
    public static void getCount(){
        System.out.println("Создано животных: " +count);
    }
    public void run(int barrierLength) {
    }

    public void swim(int barrierLength) {
    }
}

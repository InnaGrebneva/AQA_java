//1. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
//
//        2. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
//        3. Для хранения фруктов внутри коробки можно использовать ArrayList;
//        4. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
//        5. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;
//        6. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами. Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
//        7. Не забываем про метод добавления фрукта в коробку.
package Lesson10;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    public ArrayList<T> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public double getWeight() {
        double weight = 0;
        for (Fruit fruit: fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compare(Box<?> another) {
        return this.getWeight() == another.getWeight();
    }

    public void addFruit(T newFruit) {
        fruits.add(newFruit);
    }


    public void moveFruits(Box<T> another) {
        for (T fruit: fruits) {
            another.addFruit(fruit);
        }
        fruits.clear();
    }

    public static void main(String[] args) {
        Box<Apple> boxWithApples1 = new Box<>();
        Box<Apple> boxWithApples2 = new Box<>();

        Box<Orange> boxWithOranges1 = new Box<Orange>();

        boxWithApples1.addFruit(new Apple());
        boxWithApples1.addFruit(new Apple());
        boxWithApples1.addFruit(new Apple());

        System.out.println("Вес первой коробки яблок: " + boxWithApples1.getWeight());

        System.out.println("Вес второй коробки яблок: " + boxWithApples2.getWeight());

        boxWithOranges1.addFruit(new Orange());
        boxWithOranges1.addFruit(new Orange());

        System.out.println("Вес первой коробки апельсинов: " + boxWithOranges1.getWeight());

        System.out.println(boxWithApples2.compare(boxWithApples1));
        System.out.println(boxWithOranges1.compare(boxWithApples1));

        boxWithApples1.moveFruits(boxWithApples2);

        System.out.println("Переложили яблоки из 1-ой во 2-ую. Вес 1-ой коробки " + boxWithApples1.getWeight()
                + " и 2-ой коробки " + boxWithApples2.getWeight());

        boxWithApples2.moveFruits(boxWithApples1);

        System.out.println("Переложили яблоки из 1-ой во 2-ую. Вес 1-ой коробки " + boxWithApples1.getWeight()
                + " и 2-ой коробки " + boxWithApples2.getWeight());
    }

}

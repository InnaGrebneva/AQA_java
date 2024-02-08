//Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов,
//        из которых состоит массив (дубликаты не считаем). Посчитать, сколько раз встречается каждое слово.
//        (реализовать с использованием коллекций)
//        Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
//        В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get()
//        искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов
//        (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.


import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        taskOne();
        taskTwo();
    }

    public static void taskOne() {
        String[] myArray = { "кот", "пес", "кит", "конь", "рак", "пес", "жук", "конь", "кот", "лань", "утка", "конь" };
        Set<String> mySet = new HashSet<>(List.of(myArray));
        System.out.println(mySet);
        List<String> myArrayList = Arrays.asList(myArray);
        for (String string : mySet) {
            System.out.println(string + " " + Collections.frequency(myArrayList, string));
        }
    }

    public static void taskTwo() {
        Phonebook myPhonebook = new Phonebook();
        myPhonebook.add("49549498", "Кузнецов");
        myPhonebook.add("95959596", "Иванов");
        myPhonebook.add("484846615", "Кузнецов");
        myPhonebook.add("484849855", "Осипов");
        myPhonebook.add("5498484", "Петров");
        myPhonebook.add("23384848", "Кузнецов");
        myPhonebook.add("787545", "Петров");
        String name = "Кузнецов";
        System.out.println(name + " " + myPhonebook.get(name));
    }
}
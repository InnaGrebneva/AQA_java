package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Collections;

public class TaskThree {

    public static void main(String[] args) {
        List<String> fs = Arrays.asList("f10", "f15", "f2", "f4", "f4");
        Object[] fsArray = fs.stream()
                .sorted(Comparator.comparingInt(s -> Integer.parseInt(s.substring(1)))).toArray();

        System.out.println(Arrays.toString(fsArray));
//        ArrayList<String> words = new ArrayList<String>();
//        Collections.addAll(words, "f10", "f15", "f2", "f4", "f4");
//        System.out.println(Arrays.toString(sort(words)));
    }

    public static Object[] sort(ArrayList<String> words) {
        return words.stream().sorted().toArray();
    }
}



package org.example;

import java.util.ArrayList;
import java.util.Comparator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1); // 0
        numbers.add(2); // 1
        numbers.add(3); // 2
        numbers.add(4); // 3
        numbers.add(5); // 4

        numbers.remove(2); // Looks for index
        numbers.remove(Integer.valueOf(4)); // Looks for value.

        numbers.add(6);
        numbers.add(6);
        numbers.add(6);

        numbers.remove(Integer.valueOf(6)); // But it only remove the first one.

        numbers.set(2, 43);

        numbers.sort(Comparator.naturalOrder());

        numbers.forEach(num -> {
            System.out.printf("%d * 2 = %d \n", num, num * 2);
        });

        System.out.println(numbers.toString());
        System.out.println(numbers.get(1));
        System.out.println("Size: " + numbers.size());
        System.out.println("Contains 43: " + numbers.contains(Integer.valueOf(43)));
        System.out.println("isEmpty before clear: " + numbers.isEmpty());

        numbers.clear();
        System.out.println("isEmpty after clear: " + numbers.isEmpty());

        System.out.println(numbers.toString());

    }
}
package org.example;

import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> examScores = new HashMap<String , Integer>();

        examScores.put("Maths", 100);
        examScores.put("Bio", 1);
        examScores.put("Physics", 100);
        examScores.put("Chemistry", 99);
        examScores.put("English", 98);
        examScores.put("Hindi", 45);
        examScores.put("Odia", 33);
        examScores.put("SST", 50);

//        examScores.putIfAbsent(key, value)
        examScores.putIfAbsent("Maths", 83);
        examScores.replace("SST", 60);
        examScores.remove("Odia");

        System.out.println(examScores.toString());
        System.out.println("English score: " + examScores.get("English"));
        System.out.println("Eco - 101 score: " + examScores.get("Eco"));
        System.out.println("Eco - 101 default score: " + examScores.getOrDefault("Eco", -1));
        System.out.println("Size: " + examScores.size());
        System.out.println("ContainsKey: " + examScores.containsKey("Maths"));
        System.out.println("ContainsValue: " + examScores.containsValue(100));

//        examScores.forEach(key, value -> {});
        examScores.forEach((subject, score) -> {
            System.out.println(subject + " - " + score);
        });

        examScores.forEach((subject, score) -> {
            examScores.replace(subject, score - 10);
        });

        System.out.println(examScores.toString());
    }
}
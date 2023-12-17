package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public class DayOne {
    private final String fullPathToFile;
    private final LinkedList<Integer> mostCalories;

    public DayOne(String fullPathToFile) {
        this.fullPathToFile = fullPathToFile;
        this.mostCalories = new LinkedList<>();
    }

    private void addToMostCalories(int calories) {
        mostCalories.add(calories);
        Collections.sort(mostCalories);
        if (mostCalories.size() > 3) {
            mostCalories.removeFirst();
        }
    }

    private int getSumOfCalories() {
        int sumOfCalories = 0;

        for (Integer element : mostCalories) {
            sumOfCalories += element;
        }

        return sumOfCalories;
    }

    private int determineSum(int sum, String line) {
        try {
            int value = Integer.parseInt(line);
            sum += value;
        } catch (NumberFormatException ex) {
            addToMostCalories(sum);
            sum = 0;
        }
        return sum;
    }

    public int count() {
        int sum = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fullPathToFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                sum = determineSum(sum, line);
            }
            addToMostCalories(sum);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return getSumOfCalories();
    }

}
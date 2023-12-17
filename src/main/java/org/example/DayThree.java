package org.example;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DayThree {

  private enum CaseType {
    UPPER,
    LOWER
  }

  private final String filePath;
  private final HashMap<Character, Integer> alphabetPriorityValues;
  public DayThree(String filePath) {

    this.filePath = filePath;
    this.alphabetPriorityValues = determinePriorityValues(CaseType.LOWER);
  }

  private void inertIntoHashMap(HashMap<Character, Integer> hashMap, String alphabet) {
    for (int i = 0; i < alphabet.length(); i++) {
      hashMap.put(alphabet.charAt(i), i + 1);
    }
  }

  private @NotNull HashMap<Character, Integer> determinePriorityValues(CaseType alphabetType) {
    HashMap<Character, Integer> hashMap = new HashMap<>();
    if (alphabetType == CaseType.LOWER) {
      String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
      inertIntoHashMap(hashMap, alphabet);
    }
    return hashMap;
  }

  private Character determineRepeatedLetter(String ruckSack) {
    int halfOfRuckSack = Math.floorDiv(ruckSack.length(), 2);
    Set<Character> hashSet = new HashSet<>();

    for (int i = 0; i < halfOfRuckSack; i++) {
      hashSet.add(ruckSack.charAt(i));
    }
    Character repeatedLetter = null;
    for (int i = halfOfRuckSack; i < ruckSack.length(); i++) {
      if (hashSet.contains(ruckSack.charAt(i))) {
        repeatedLetter = ruckSack.charAt(i);
      }
    }
    return repeatedLetter;
  }



  public int reorganiseRuckSack() {
    int sum = 0;
    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
      String line;
      while ((line = br.readLine()) != null) {
        Character repeatedLetter = determineRepeatedLetter(line);
        sum += alphabetPriorityValues.get(repeatedLetter);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return sum;
  }

}

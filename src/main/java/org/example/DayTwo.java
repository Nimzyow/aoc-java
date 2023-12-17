package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class DayTwo {

  private final String fullPath;

  private Map<Character, Map<Character, Character>> rules;
  private Map<Character, Integer> gamePoints;
  private Map<Character, Integer> handPoints;

  public Map<Character, Map<Character, Character>> getRule() {
    return rules;
  }

  public DayTwo(String fullPath) {
    this.fullPath = fullPath;
    this.rules = new HashMap<>();
    this.gamePoints = new HashMap<>();
    this.handPoints = new HashMap<>();

    rules.put('A', Map.of('Z', 'Y', 'Y', 'X', 'X', 'Z'));
    rules.put('B', Map.of('Z', 'Z', 'Y', 'Y', 'X', 'X'));
    rules.put('C', Map.of('Z', 'X', 'Y', 'Z', 'X', 'Y'));

    gamePoints.put('X', 0);
    gamePoints.put('Y', 3);
    gamePoints.put('Z', 6);

    handPoints.put('X', 1);
    handPoints.put('Y', 2);
    handPoints.put('Z', 3);

  }

  public int result() {

    int score = 0;
    try (BufferedReader br = new BufferedReader(new FileReader(fullPath))) {
      String line;
      while ((line = br.readLine()) != null) {
        char characterAtTwo = line.charAt(2);
        score += (handPoints.get(getInnerMap(line).get(characterAtTwo))
            + gamePoints.get(characterAtTwo));

      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return score;
  }

  private Map<Character, Character> getInnerMap(String line) {
    char characterAtZero = line.charAt(0);
    Map<Character, Character> innerMap = rules.get(characterAtZero);
    return innerMap;
  }

}

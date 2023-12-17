package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DayTwoTest {
  @Test
  public void given_basicInput_then_ReturnTwelve() {
    String fullPath = "/Users/nimasoufiani/workspace/projects/advent-of-code-java/_2022/src/main/resources/dayTwo/2";
    DayTwo dayTwo = new DayTwo(fullPath);
    int result = dayTwo.result();

    assertEquals(12, result);
  }

  @Test
  public void given_basicInput_then_ReturnTwentyOne() {
    String fullPath = "/Users/nimasoufiani/workspace/projects/advent-of-code-java/_2022/src/main/resources/dayTwo/basicTwo";
    DayTwo dayTwo = new DayTwo(fullPath);
    int result = dayTwo.result();

    assertEquals(21, result);
  }
}

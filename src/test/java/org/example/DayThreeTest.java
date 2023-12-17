package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class DayThreeTest {
  @Test
  public void given_rucksackWithRepeatedP_then_ReturnSixteen() {
    String fullPath = "/Users/nimasoufiani/workspace/projects/advent-of-code-java/_2022/src/main/resources/dayThree/1";
    DayThree ruckSack = new DayThree(fullPath);
    int repeatedLetter = ruckSack.reorganiseRuckSack();

    assertEquals(16, repeatedLetter);
  }

  @Test
  public void given_rucksackWithRepeatedP_then_Return157() {
    String fullPath = "/Users/nimasoufiani/workspace/projects/advent-of-code-java/_2022/src/main/resources/dayThree/2";
    DayThree ruckSack = new DayThree(fullPath);
    int repeatedLetter = ruckSack.reorganiseRuckSack();

    assertEquals(157, repeatedLetter);
  }

}

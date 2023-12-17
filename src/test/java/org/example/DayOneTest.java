package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DayOneTest {
    @Test
    public void given_ThreeSetsOfNumbers_then_ReturnSum() {
        String fullPath = "/Users/nimasoufiani/workspace/projects/advent-of-code-java/_2022/src/main/resources/dayOne/numbers";
        DayOne testCalories = new DayOne(fullPath);
        int result = testCalories.count();

        assertEquals(248, result);
    }

    @Test
    public void given_MoreThanThreeSetsOfNumbers_then_ReturnSumOfTopThreeSets() {
        String fullPath = "/Users/nimasoufiani/workspace/projects/advent-of-code-java/_2022/src/main/resources/dayOne/numbersWithMoreThanThreeSets";
        DayOne testCalories = new DayOne(fullPath);
        int result = testCalories.count();

        assertEquals(330, result);
    }
}

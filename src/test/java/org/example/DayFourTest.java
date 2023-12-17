package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayFourTest {
    @Test
    public void given_DocumentOfOverlappingPairs_then_ReturnTwo() {
        String filePath = "/Users/nimasoufiani/workspace/projects/advent-of-code-java/_2022/src/main/resources/dayFour/1";
        DayFour dayFour = new DayFour();
        int result = dayFour.totalOverlappingPairs(filePath);

        assertEquals(2, result);
    }
    @Test
    public void given_DocumentOfOverlappingPairs_then_ReturnOne() {
        String filePath = "/Users/nimasoufiani/workspace/projects/advent-of-code-java/_2022/src/main/resources/dayFour/2";
        DayFour dayFour = new DayFour();
        int result = dayFour.totalOverlappingPairs(filePath);

        assertEquals(1, result);
    }
}

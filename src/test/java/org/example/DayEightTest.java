package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayEightTest {
    @Test
    public void given_16TreesVisibleFromOuterEdge_when_5TreesVisibleFromInterior_thenReturn21() {
        String fullPath = "/Users/nimasoufiani/workspace/projects/advent-of-code-java/_2022/src/main/resources/dayEight/1";
        DayEight dayEight = new DayEight();
        int result = dayEight.getVisibleTrees(fullPath);

        assertEquals(21, result);
    }

    @Test
    public void given_12TreesVisibleFromOuterEdge_when_1TreesVisibleFromInterior_thenReturn13() {
        String fullPath = "/Users/nimasoufiani/workspace/projects/advent-of-code-java/_2022/src/main/resources/dayEight/2";
        DayEight dayEight = new DayEight();
        int result = dayEight.getVisibleTrees(fullPath);

        assertEquals(13, result);
    }
}

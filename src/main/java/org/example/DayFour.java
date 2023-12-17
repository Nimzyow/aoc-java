package org.example;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class DayFour {
    private int overlappingPairs;
    public int totalOverlappingPairs(String filePath) {
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = br.readLine()) != null) {
                ArrayList<HashMap<String, Integer>> assignments = generateSections(line);
                overlappingPairs += getOverlappingPairs(assignments);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
        return overlappingPairs;
    }

    @NotNull
    private static HashMap<String, Integer> getStringIntegerHashMap(String pair) {
        HashMap<String, Integer> assignment = new HashMap<>();
        assignment.put("start", Integer.parseInt(String.valueOf(pair.charAt(0))));
        assignment.put("end", Integer.parseInt(String.valueOf(pair.charAt(2))));
        return assignment;
    }

    @NotNull
    private static ArrayList<HashMap<String, Integer>> generateSections(@NotNull String line) {
        ArrayList<HashMap<String, Integer>> assignments = new ArrayList<>();
        String[] lineSplit = line.split(",\\s*");
        for (String pair: lineSplit) {
            HashMap<String, Integer> assignment = getStringIntegerHashMap(pair);
            assignments.add(assignment);
        }
        return assignments;
    }

    private static int getOverlappingPairs(@NotNull ArrayList<HashMap<String, Integer>> assignments) {
        int overlappingPairs = 0;
        if (assignments.get(0).get("start") <= assignments.get(1).get("start")
                && assignments.get(0).get("end") >= assignments.get(1).get("end")
                || assignments.get(1).get("start") <= assignments.get(0).get("start")
                && assignments.get(1).get("end") >= assignments.get(0).get("end")) {
            overlappingPairs += 1;
        }
        return overlappingPairs;
    }

}

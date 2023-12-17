package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class DayFour {
    public int totalOverlappingPairs(String filePath) {
        int overlappingPairs = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = br.readLine()) != null) {
                List<Map<String, Integer>> assignments = new ArrayList<>();
                String[] lineSplit = line.split(",\\s*");
                for (String pair: lineSplit) {
                    Map<String, Integer> assignment = new HashMap<>();
                    assignment.put("start", Integer.parseInt(String.valueOf(pair.charAt(0))));
                    assignment.put("end", Integer.parseInt(String.valueOf(pair.charAt(2))));
                    assignments.add(assignment);
                }
                if (assignments.get(0).get("start") <= assignments.get(1).get("start") && assignments.get(0).get("end") >= assignments.get(1).get("end")) {
                    overlappingPairs += 1;
                } else if (assignments.get(1).get("start") <= assignments.get(0).get("start") && assignments.get(1).get("end") >= assignments.get(0).get("end")) {
                    overlappingPairs +=1;
                }
            }
            return overlappingPairs;
        } catch(IOException e) {
            e.printStackTrace();
        }
        return overlappingPairs;
    }
}

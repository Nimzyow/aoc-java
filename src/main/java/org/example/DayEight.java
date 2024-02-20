package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;

public class DayEight {
    private LinkedList<Integer[]> trees = new LinkedList<>();

    public LinkedList<Integer[]> getTrees() {
        return trees;
    }

    public void setTrees(Integer[] trees) {
        this.trees.add(trees);
    }

    private void processTreeRow(BufferedReader br) throws IOException {
        String line;
        while ((line = br.readLine()) != null) {
            String[] lineSplit = line.split("");
            Integer[] treeRow = new Integer[lineSplit.length];
            for (int i = 0; i < treeRow.length; i++) {
                treeRow[i] = Integer.parseInt(lineSplit[i]);
            }
            setTrees(treeRow);
        }
    }

    public Integer isTreeVisibleToLeft(Integer[] coordinates) {
        return 1;
    }

    public int getVisibleTrees(String fullPath) {
        int numberOfVisibleTrees = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fullPath))) {
            processTreeRow(br);
            Integer[] coordinates = new Integer[2];
            coordinates[0] = 1;
            coordinates[1] = 2;
            Integer isTreeVisibleToLeft = isTreeVisibleToLeft(coordinates);
            Integer isTreeVisibleToRight = isTreeVisibleToRight();
            Integer isTreeVisibleUp = isTreeVisibleUp();
            Integer isTreeVisibleDown = isTreeVisibleDown();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numberOfVisibleTrees;
    }

    // private int isTreeVisibleHorizontally() {
    // // I need height of tree
    // // position the tree is at in terms of column and row
    // int row = 0;
    // int treeHorizontal = 0;
    // int highestTreeHorizontally = 0;
    // for (int i = 1; i < trees.size() - 1; i++) {
    // int columnToAssess = 1;
    // for (int j = 0; j < trees.get(i).length; j++) {
    // highestTreeHorizontally = Math.max(highestTreeHorizontally,
    // getTrees().get(i)[columnToAssess]);
    // if (highestTreeHorizontally >= trees.get(i)[columnToAssess] && j <
    // columnToAssess) {
    // j = columnToAssess;
    // treeHorizontal += 1;
    // highestTreeHorizontally = 0;
    // }
    // }
    // // if (highestTree >= ) {
    // //
    // // }
    // }

    // int number_of_sides_the_tree_is_visible = 0;
    // for (int i = 0; i < treePosition.get("column"); i++) {
    // if (trees.get(treePosition.get("row"))[i] >= heightOfTree) {
    // number_of_sides_the_tree_is_visible += 1;
    // break;
    // }
    // }
    // for (int i = treePosition.get("column") + 1; i <
    // trees.get(treePosition.get("row")).length; i++) {
    // if (trees.get(treePosition.get("row"))[i] >= heightOfTree) {
    // number_of_sides_the_tree_is_visible += 1;
    // break;
    // }
    // }
    // return 7;
    // }

}

/*
 * Ok so this will be the plan
 * Need to split this into appropriate data structure. e.g:
 * [[1,2,3], [4,5,6], [7,8,9]]
 */
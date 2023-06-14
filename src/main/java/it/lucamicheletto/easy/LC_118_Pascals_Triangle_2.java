package it.lucamicheletto.easy;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_118_Pascals_Triangle_2 {
//    public List<Integer> getRow(int rowIndex) {
//        List<List<Integer>> pascalTriangle = new ArrayList<>(rowIndex + 1);
//
//        pascalTriangle.add(List.of(1));
//
//        if (rowIndex + 1 >= 2) {
//            pascalTriangle.add(List.of(1, 1));
//        }
//
//        for (int levelIndex = 2; levelIndex < rowIndex + 2; levelIndex++) {
//            List<Integer> row = Arrays.asList(new Integer[levelIndex + 1]);
//
//            row.set(0, 1);
//            row.set(levelIndex, 1);
//
//            for (int k = 1; k < levelIndex; k++) {
//                int left = pascalTriangle.get(levelIndex - 1).get(k - 1);
//                int right = pascalTriangle.get(levelIndex - 1).get(k);
//
//                row.set(k, left + right);
//            }
//
//            pascalTriangle.add(row);
//        }
//
//        return pascalTriangle.get(rowIndex);
//    }


    // Improved, it's kinda clever actually
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> level = new ArrayList<>();

        if (rowIndex < 0) {
            return level;
        }

        level.add(1);

        for (int i = 1; i <= rowIndex; i++) {
            for (int j = level.size() - 2; j >= 0; j--) {
                level.set(j + 1, level.get(j) + level.get(j + 1));
            }

            level.add(1);
        }

        return level;
    }
}
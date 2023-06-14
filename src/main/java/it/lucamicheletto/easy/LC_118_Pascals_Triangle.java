package it.lucamicheletto.easy;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_118_Pascals_Triangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>(numRows);

        if (numRows == 0) {
            return pascalTriangle;
        }

        pascalTriangle.add(List.of(1));

        if (numRows >= 2) {
            pascalTriangle.add(List.of(1, 1));
        }

        for (int rowIndex = 2; rowIndex < numRows; rowIndex++) {
            List<Integer> row = Arrays.asList(new Integer[rowIndex + 1]);

            row.set(0, 1);
            row.set(rowIndex, 1);

            for (int k = 1; k < rowIndex; k++) {
                int left = pascalTriangle.get(rowIndex - 1).get(k - 1);
                int right = pascalTriangle.get(rowIndex - 1).get(k);

                row.set(k, left + right);
            }

            pascalTriangle.add(row);
        }

        return pascalTriangle;
    }
}


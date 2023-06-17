package it.lucamicheletto.easy;

public class LC_171_ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        int column = 0;
        for (int i = columnTitle.length() - 1; i >= 0; i--) {
            column += (columnTitle.charAt(i) - '@') * Math.pow(26, columnTitle.length() - 1 - i);
        }
        return column;
    }

    private int charIntValue(char c) {
        return c - 'A';
    }
}

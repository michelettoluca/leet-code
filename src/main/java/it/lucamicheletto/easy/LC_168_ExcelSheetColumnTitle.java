package it.lucamicheletto.easy;

public class LC_168_ExcelSheetColumnTitle {
    // Base change formula had to look this shit up
    public String convertToTitle(int columnNumber) {
        columnNumber--;

        if (columnNumber < 26) {
            return toLetterString(columnNumber);
        }

        int newColumnNumber = columnNumber / 26;
        int charValue = columnNumber % 26;

        return convertToTitle(newColumnNumber) + toLetterString(charValue);
    }

    private String toLetterString(int charValue) {
        return Character.toString('A' + charValue);
    }
}

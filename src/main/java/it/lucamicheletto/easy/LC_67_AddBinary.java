package it.lucamicheletto.easy;

public class LC_67_AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder sum = new StringBuilder();

        int i = a.length() - 1;
        int k = b.length() - 1;

        int carry = 0;

        while (i >= 0 || k >= 0) {
            int bitA = i >= 0 ? intValue(a.charAt(i--)) : 0;
            int bitB = k >= 0 ? intValue(b.charAt(k--)) : 0;

            sum.append((bitA + bitB + carry) % 2);
            carry = (bitA + bitB + carry) / 2;
        }

        if (carry != 0) {
            sum.append(carry);
        }

        return sum.reverse().toString();
    }

    private int intValue(char c) {
        return c - '0';
    }
}


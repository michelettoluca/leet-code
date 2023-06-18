package it.lucamicheletto.easy;

import java.util.ArrayList;
import java.util.List;

public class LC_231_PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n == 0) return false;

        if (n == 1) return true;

        if (n % 2 == 1) return false;

        return isPowerOfTwo(n / 2);
    }

//    public boolean isPowerOfTwo(int n) {
//        double nAsDouble = (double) n;
//
//        while (nAsDouble > 1.0) {
//            nAsDouble = nAsDouble / 2;
//        }
//
//        return nAsDouble == 1.0;
//    }
}
package it.lucamicheletto.easy;

import java.util.Deque;

public class LC_66_PlusOne {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                break;
            }
        }

        // Questo trick funziona perché l'array viene inizializzato
        // con tutti i valori a 0, e l'unico caso in cui va aggiunta una
        // cifra al numero è quando sono tutti 9.
        if (digits[0] == 0) {
            int[] num = new int[digits.length + 1];

            num[0] = 1;
            return num;
        }

        return digits;
    }
}

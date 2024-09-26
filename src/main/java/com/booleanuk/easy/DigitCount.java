package com.booleanuk.easy;

/**
 * Given a number, count the number of digits. E.g.
 * 318 -> 3
 * 92563 -> 5
 * 4666 -> 4
 */
public class DigitCount {
    public int solution(int input) {
        String s = String.valueOf(input);
        return s.length();
    }
}

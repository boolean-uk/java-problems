package com.booleanuk.easy;

/**
 * Given a number and a length, return an array that contains the length amount of multiples of the number. E.g.
 * solution(7, 5) -> [7, 14, 21, 28, 35]
 * solution(12, 10) -> [12, 24, 36, 48, 60, 72, 84, 96, 108, 120]
 */
public class Multiples {
    public int[] solution(int number, int length) {
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = number * (i + 1);
        }
        return result;
    }
}

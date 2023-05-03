package com.booleanuk.easy;

/**
 * Convert kilometers to miles.
 * Assume that a mile is 1.6 kilometers and round your answer to the nearest mile.
 * E.g. 2.4 miles should be 2, 1.6 miles should also be 2. 2.5 miles should be 3.
 */
public class KmToM {
    public int solution(float kilometers) {
        int miles = Math.round(kilometers/1.6f);
        return miles;
    }
}

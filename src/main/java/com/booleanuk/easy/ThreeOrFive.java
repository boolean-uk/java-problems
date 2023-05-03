package com.booleanuk.easy;

/**
 * If you list all the natural numbers below 10 that are multiples of 3 or 5, you'll get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Implement the solution method so that it returns the sum of all multiples of 3 or 5 below the input number.
 */
public class ThreeOrFive {
    public int solution(int input) {
        int sum = 0;
        for (int i = 0; i < input; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

package com.booleanuk.hard;

/**
 * A number is said to be Disarium if the sum of its digits raised to their respective positions is the number itself.
 * Given a number, return a boolean to determine if it is Disarium.
 * E.g.
 * solution(75) -> false because 7^1 + 5^2 = 7 + 25 = 32
 * solution(135) ➞ true because 1^1 + 3^2 + 5^3 = 1 + 9 + 125 = 135
 */
public class Disarium {
    public boolean solution(int number) {
        String numberString = String.valueOf(number);
        int sum = 0;
        for (int i = 0; i < numberString.length(); i++) {
            sum +=(int) Math.pow(Character.getNumericValue(numberString.charAt(i)),i+1);
        }
        return sum==number;
    }


}

package com.booleanuk.easy;

/**
 * Given a string, return the same string with each character repeated once. E.g.
 * "String" -> "SSttrriinngg"
 */
public class Repeat {
    public String solution(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            result.append(c);
            result.append(c);
        }
        return result.toString();
    }
}

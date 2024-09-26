package com.booleanuk.easy;

/**
 * Given a string, capitalise the first letter and add a full stop to the end. If the string already ends with any form
 * of punctuation, do not add a full stop.
 */
public class MakeSentence {
    public String solution(String input) {
        String output = input.substring(0, 1).toUpperCase() + input.substring(1);

        // Check if the string already ends with punctuation
        if (!output.matches(".*[.?!]$")) {
            // If it doesn't end with punctuation, add a full stop to the end
            output += ".";
        }

        return output;
    }
}

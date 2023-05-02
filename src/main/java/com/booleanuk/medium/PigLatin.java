package com.booleanuk.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * Translate any string into Pig Latin.
 */
public class PigLatin {
    public String solution(String input) {
        // Define a set of vowels
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        // Split the input into words using spaces as delimiters
        String[] words = input.split(" ");

        // Define a StringBuilder to store the Pig Latin representation of the input text
        StringBuilder pigLatinBuilder = new StringBuilder();

        // Iterate through each word in the input text
        for (String word : words) {
            // Convert the word to lowercase for easier processing
            word = word.toLowerCase();

            // Find the index of the first vowel in the word
            int firstVowelIndex = -1;
            for (int i = 0; i < word.length(); i++) {
                if (vowels.contains(word.charAt(i))) {
                    firstVowelIndex = i;
                    break;
                }
            }

            // If the word starts with a vowel, simply append "way" to the end of the word
            if (firstVowelIndex == 0) {
                pigLatinBuilder.append(word).append("yay ");
            } else {

                String pigLatinWord = word.substring(firstVowelIndex) + word.substring(0, firstVowelIndex) + "ay ";
                pigLatinBuilder.append(pigLatinWord);
            }
        }

        return pigLatinBuilder.toString().trim();
    }
}

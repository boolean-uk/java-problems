package com.booleanuk.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Convert English text to morse code.
 */
public class MorseCode {
    public String solution(String input) {
        // Define a HashMap to store the mapping between English letters and Morse code
        Map<Character, String> morseMap = new HashMap<>();
        morseMap.put('A', ".-");
        morseMap.put('B', "-...");
        morseMap.put('C', "-.-.");
        morseMap.put('D', "-..");
        morseMap.put('E', ".");
        morseMap.put('F', "..-.");
        morseMap.put('G', "--.");
        morseMap.put('H', "....");
        morseMap.put('I', "..");
        morseMap.put('J', ".---");
        morseMap.put('K', "-.-");
        morseMap.put('L', ".-..");
        morseMap.put('M', "--");
        morseMap.put('N', "-.");
        morseMap.put('O', "---");
        morseMap.put('P', ".--.");
        morseMap.put('Q', "--.-");
        morseMap.put('R', ".-.");
        morseMap.put('S', "...");
        morseMap.put('T', "-");
        morseMap.put('U', "..-");
        morseMap.put('V', "...-");
        morseMap.put('W', ".--");
        morseMap.put('X', "-..-");
        morseMap.put('Y', "-.--");
        morseMap.put('Z', "--..");
        morseMap.put(',', "--..--");
        morseMap.put('!',"-.-.--");

        // Define a StringBuilder to store the Morse code representation of the input text
        StringBuilder morseBuilder = new StringBuilder();

        // Iterate through each character of the input text
        for (char c : input.toUpperCase().toCharArray()) {
            if (c == ' ') {
                // If the character is a space, add a space to the Morse code string
                morseBuilder.append("/ ");
            } else if (morseMap.containsKey(c)) {
                // If the character is a valid letter, look up its Morse code representation in the HashMap
                morseBuilder.append(morseMap.get(c)).append(" ");
            }
        }

        return morseBuilder.toString().trim();

    }
}

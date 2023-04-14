package com.booleanuk.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MorseCodeTest {
    @Test
    public void shouldConvertToMorseCode() {
        MorseCode problem = new MorseCode();
        Assertions.assertEquals(".... . .-.. .-.. --- --..-- / .-- --- .-. .-.. -.. -.-.--", problem.solution("Hello, world!"));
        Assertions.assertEquals("-- ..- ... .", problem.solution("Muse"));
        Assertions.assertEquals("-... --- --- .-.. . .- -.", problem.solution("Boolean"));
    }
}

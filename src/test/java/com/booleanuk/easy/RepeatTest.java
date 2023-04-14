package com.booleanuk.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RepeatTest {
    @Test
    public void shouldRepeatCharacters() {
        Repeat problem = new Repeat();
        Assertions.assertEquals("SSttrriinngg", problem.solution("String"));
        Assertions.assertEquals("HHeelllloo  WWoorrlldd!!", problem.solution("Hello World!"));
        Assertions.assertEquals("11223344!!__  ", problem.solution("1234!_ "));
    }
}

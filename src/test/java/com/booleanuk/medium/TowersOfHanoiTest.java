package com.booleanuk.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TowersOfHanoiTest {
    @Test
    public void shouldConvertToMorseCode() {
        TowersOfHanoi problem = new TowersOfHanoi();
        Assertions.assertEquals(7, problem.solution(3));
        Assertions.assertEquals(31, problem.solution(5));
        Assertions.assertEquals(0, problem.solution(0));
    }
}

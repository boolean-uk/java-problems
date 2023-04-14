package com.booleanuk.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DigitCountTest {
    @Test
    public void shouldCountDigits() {
        DigitCount problem = new DigitCount();
        Assertions.assertEquals(3, problem.solution(318));
        Assertions.assertEquals(5, problem.solution(92563));
        Assertions.assertEquals(6, problem.solution(314890));
    }
}

package com.booleanuk.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ThreeOrFiveTest {
    @Test
    public void shouldSumAllMultiplesBelow1000() {
        ThreeOrFive problem = new ThreeOrFive();
        Assertions.assertEquals(233168, problem.solution(1000));
    }
}

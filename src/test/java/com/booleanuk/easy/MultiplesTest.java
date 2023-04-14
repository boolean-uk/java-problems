package com.booleanuk.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultiplesTest {
    @Test
    public void shouldReturnMultiples() {
        Multiples problem = new Multiples();
        Assertions.assertEquals(new int[]{7, 14, 21, 28, 35}, problem.solution(7, 5));
        Assertions.assertEquals(new int[]{12, 24, 36, 48, 60, 72, 84, 96, 108, 120}, problem.solution(12, 10));
        Assertions.assertEquals(new int[]{17, 34, 51, 68, 85, 102}, problem.solution(17, 6));
    }
}

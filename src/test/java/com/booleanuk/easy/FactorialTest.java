package com.booleanuk.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTest {
    @Test
    public void shouldFindFactorial() {
        Factorial problem = new Factorial();
        Assertions.assertEquals(120, problem.solution(5));
        Assertions.assertEquals(362880, problem.solution(9));
    }
}

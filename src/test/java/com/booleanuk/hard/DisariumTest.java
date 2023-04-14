package com.booleanuk.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DisariumTest {
    @Test
    public void shouldDetermineDisarium() {
        Disarium problem = new Disarium();
        Assertions.assertFalse(problem.solution(75));
        Assertions.assertFalse(problem.solution(544));
        Assertions.assertFalse(problem.solution(466));
        Assertions.assertTrue(problem.solution(135));
        Assertions.assertTrue(problem.solution(8));
    }
}

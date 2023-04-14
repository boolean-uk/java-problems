package com.booleanuk.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KmToMTest {
    @Test
    public void shouldConvertAndRound() {
        KmToM problem = new KmToM();
        Assertions.assertEquals(4, problem.solution(7f));
        Assertions.assertEquals(4, problem.solution(5.8f));
        Assertions.assertEquals(2, problem.solution(3.2f));
    }
}

package com.booleanuk.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PigLatinTest {
    @Test
    public void shouldConvertToPigLatin() {
        PigLatin problem = new PigLatin();
        Assertions.assertEquals("atwhay evenyay isyay igpay atinlay", problem.solution("What even is pig latin"));
        Assertions.assertEquals("Hetay uickqay rownbay oxfay", problem.solution("The quick brown fox"));
    }
}

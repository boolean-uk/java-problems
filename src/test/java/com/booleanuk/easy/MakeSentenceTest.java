package com.booleanuk.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MakeSentenceTest {
    @Test
    public void shouldMakeSentence() {
        MakeSentence problem = new MakeSentence();
        Assertions.assertEquals("Hello, world.", problem.solution("hello, world"));
        Assertions.assertEquals("Goodbye, world!", problem.solution("goodbye, world!"));
        Assertions.assertEquals("Hello, world?", problem.solution("hello, world?"));
    }
}

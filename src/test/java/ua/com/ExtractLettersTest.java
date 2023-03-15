package ua.com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExtractLettersTest {
    private final ExtractLetters extractLetters = new ExtractLetters();

    @Test
    public void ExtractsLettersTest(){
        String expected1 = "t: 2\n" +
                "w: 1\n";
        Assertions.assertEquals(expected1, extractLetters.ExtractsLetters("w4tt!7"));
        String expected2 = "a: 5\n" +
                "g: 2\n";
        Assertions.assertEquals(expected2, extractLetters.ExtractsLetters("a4a46gg6a754a&&^a"));
    }
}

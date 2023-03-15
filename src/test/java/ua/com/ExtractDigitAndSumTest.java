package ua.com;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExtractDigitAndSumTest {
 private final ExtractDigitAndSum sumDigits = new ExtractDigitAndSum();

    @Test
    public void ExtractsNumbersAndSumTest() {
        Assertions.assertEquals( 127, sumDigits.extractsNumbersAndSum("qwe123qwe2qw2"));
        Assertions.assertEquals( 12, sumDigits.extractsNumbersAndSum("q5we3qwe2qw2"));
        Assertions.assertEquals( 0, sumDigits.extractsNumbersAndSum(""));
    }
}

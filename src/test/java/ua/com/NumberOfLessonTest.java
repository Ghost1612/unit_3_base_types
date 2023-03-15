package ua.com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfLessonTest {
    private final NumberOfLesson numberLesson = new NumberOfLesson();

    @Test
    public void returnTimeEndLessonTest(){
        int[] expected1 = {10, 35};
        Assertions.assertArrayEquals(expected1, numberLesson.returnTimeEndLesson(2));
        int[] expected2 = {11, 35};
        Assertions.assertArrayEquals(expected2, numberLesson.returnTimeEndLesson(3));
    }
}

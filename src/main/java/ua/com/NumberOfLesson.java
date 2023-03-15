package ua.com;

public class NumberOfLesson {

    public int[] returnTimeEndLesson(int lesson) {
        int lessonStartHour = 9;
        int lessonStartMinute = 0;
        int lessonDuration = 45;
        int shortBreakDuration = 5;
        int longBreakDuration = 15;
        int[] result = new int[2];

        int lessonEndMinute = lessonStartMinute + lesson * lessonDuration
                + (lesson / 2) * shortBreakDuration
                + ((lesson - 1 ) / 2 ) * longBreakDuration;

        int lessonEndHour = lessonStartHour + lessonEndMinute / 60;
        lessonEndMinute = lessonEndMinute % 60;

        result[0] = lessonEndHour;
        result[1] = lessonEndMinute;
        return result;
    }

}

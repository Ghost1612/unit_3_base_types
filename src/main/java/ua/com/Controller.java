package ua.com;

import java.util.Arrays;
import java.util.Scanner;

public class Controller {

    private Scanner scanner = new Scanner(System.in);

    public void getMain(){
        ExtractDigitAndSum extractDigitAndSum = new ExtractDigitAndSum();
        ExtractLetters extractLetters = new ExtractLetters();
        NumberOfLesson numberOfLesson = new NumberOfLesson();

        while(true){
            System.out.println("""        
                Select your task:
                1 - Extract digits from string
                2 - Extract letters from string
                3 - Return number of lesson""");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Enter your string:");
                    String inputStringDigits = scanner.next();
                    System.out.println(extractDigitAndSum.extractsNumbersAndSum(inputStringDigits));
                    break;
                case 2:
                    System.out.println("Enter your string:");
                    String inputStringLetters = scanner.next();
                    System.out.println(extractLetters.ExtractsLetters(inputStringLetters));
                    break;
                case 3:
                    System.out.println("Enter number of lesson:");
                    int lessonNumber = scanner.nextInt();
                    for (int i : numberOfLesson.returnTimeEndLesson(lessonNumber)) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    break;
            }
        }
    }
}

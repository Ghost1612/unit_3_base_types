package ua.com;


public class ExtractDigitAndSum {

    public int extractsNumbersAndSum(String str){
        int sum = 0;
        String[] numbers = str.split("\\D+");
        for (String number : numbers) {
            if (!number.isEmpty()) {
                sum += Integer.parseInt(number);
            }
        }
        return sum;
    }
}

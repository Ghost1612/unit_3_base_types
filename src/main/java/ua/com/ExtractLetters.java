package ua.com;

import java.util.Arrays;

public class ExtractLetters {

    public String ExtractsLetters(String str){

        char[] letters = str.replaceAll("[^\\p{L}]", "").toCharArray();
        Arrays.sort(letters);
        String result = new String();
        int count = 1;
        for (int i = 0; i < letters.length; i++) {
            if (i == letters.length - 1 || letters[i] != letters[i + 1]) {
                result += letters[i]  + ": " + count + "\n";
                count = 1;
            } else {
                count++;
            }
        }
        return result;
    }
}

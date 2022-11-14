package pilotCoding;

import java.util.Arrays;

public class OneTwoThreeFour {
    public static void main(String[] args) {
        String [] words = {"one","two","three","four"};
        String [] other = new String[words.length];
        int index = 0;

        for (String word: words){
            other[index++]= word+word.length();
        }
        System.out.println(Arrays.toString(other));
        // output = [one3, two3, three5, four4]
    }
}

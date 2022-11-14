package week05_10_08_2022;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        // if we want to get specific char. charAt();
            //0123
        String str="Adam";
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));

        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str);

        String str1="    Adam    ";
        System.out.println("str1 = " + str1);
        System.out.println(str1.trim());

        // indexOf
        String number="0123456";
        System.out.println(number.indexOf('3'));
        System.out.println(number.indexOf("34"));
        System.out.println(number.indexOf("56"));
        System.out.println(number.indexOf("14")); // there is no 14 that string

        String sentence="Java is a programming languange";
        System.out.println("length = " + (sentence.length()));
        System.out.println(sentence.indexOf(" programming"));
        System.out.println(sentence.indexOf("angua"));

        System.out.println(sentence.lastIndexOf(" programming"));
        System.out.println(sentence.lastIndexOf("e"));


        String word= "Example";
        int indexOfLastChar = word.length() - 1; //index of e
        int indexOfSecondFromLast = word.length() - 2; //index of l
        char last=word.charAt(indexOfLastChar);
        char beforeLast=word.charAt(indexOfSecondFromLast);
        String lastTwo=""+beforeLast+last;
        System.out.println(lastTwo+lastTwo+lastTwo);

        // replace() or replaceFirst()
        String sentence3="Java is a hard programming language";
        System.out.println(sentence3.replace("hard", "easy"));
        System.out.println(sentence3.replaceFirst("Java", "C#"));

        // substring()
        /*
          C y d e o
          0 1 2 3 4
        */
        String subs="Cydeo";
        // get the "yde" from subs variable
        System.out.println(subs.substring(1,4)); // yde
        System.out.println(subs.substring(0,2)); // Cy

        String exp="Hello";
        System.out.println(exp.substring(1,4));
/*
        // get result without first and last char of given string
        String exp1 = new Scanner(System.in).nextLine();
        System.out.println(exp1.substring(1,exp1.length()-1));
*/
        // repeat() => jdk.11  (jdk.8 is not include repeat() method)
        String str4="Adam";
        System.out.println(str4.repeat(4));

        // isEmpty() => this method is checking length, is it zero or not..
        String str5=" ";
        System.out.println(str5.isEmpty());
        System.out.println(str5.length());

        // isBlank() => it is checking spaces
        System.out.println(str5.isBlank());

        // equals() => to compare two string values with exact matching
        // equalsIgnoreCase() =>
        // startsWith()
        // endsWith()
        // contains()

        // loop
        String pass = "Cydeo";
        char enc = '*';
        String encPass = "";
        for (int i = 0; i < pass.length(); i++)
        {
            encPass += "" + pass.charAt(i) + enc;

        }
        System.out.println(encPass);


    }


}

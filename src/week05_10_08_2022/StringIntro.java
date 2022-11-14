package week05_10_08_2022;

import java.sql.SQLOutput;

public class StringIntro {

    //@Contract(pure = true)
    public static void main(String[] args) {
        // we can create String two different ways
        // 1. with String Literal

        String str="Kazim";
        String str1="Kazim";
        System.out.println(str1==str);

        // 2. with "new" keyword
        String str2=new String("Kazim");
        String str3=new String("Kazim");
        System.out.println(str1==str2);
        System.out.println(str2==str3);


    }


}
